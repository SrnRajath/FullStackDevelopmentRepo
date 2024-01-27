package com.gentech.abstractionConcept;

abstract class T1 {
	T1(int val) {
		System.out.println("Value for T1: "+val);
	}
	T1(String name) {
		System.out.println("Name for T1: "+name);
	}
}
abstract class T2 extends T1 {
	T2(int val1, int val2) {
		super(val1);
		System.out.println("Value for T2: "+val2);
	}
	T2(String n1, String n2) {
		super(n1);
		System.out.println("Name for T2: "+n2);
	}
}
class T3 extends T2 {

	T3(int val1, int val2, int val3) {
		super(val1, val2);
		System.out.println("Value for T3: "+val3);
	}
	T3(String n1, String n2, String n3) {
		super(n1, n2);
		System.out.println("Name for T3: "+n3);
	}
	
}
public class Assignment6AbstractClassConstructorOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t11 = new T3(5, 10, 15);
		T1 t12 = new T3("Class", "Student", "Teacher");
	}

}
