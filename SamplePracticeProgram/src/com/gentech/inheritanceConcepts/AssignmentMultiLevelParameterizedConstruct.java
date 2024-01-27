package com.gentech.inheritanceConcepts;

class A {
	A(String s) {
		System.out.println("Name for class A: " + s);
	}
}

class B extends A {
	B(String s, int n) {
		super(s);
		System.out.println("Value for class B: " + n);
	}
}

class C extends B {

	C(String s, int n, char c) {
		super(s, n);
		System.out.println("Character for class C: "+c);
	}
	
}

public class AssignmentMultiLevelParameterizedConstruct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C("Santosh", 5, 'A');

	}

}
