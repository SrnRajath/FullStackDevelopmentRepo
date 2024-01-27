package com.gentech.inheritanceConcepts;
class Add {
	int res;
	Add() {
		res = 0;
		System.out.println("default value: "+res);
	}
	Add(int x) {
		res = x;
		System.out.println("Single value: "+res);
	}
	Add(int x, int y) {
		res = x+y;
		System.out.println("addition of 2 values: "+res);
	}
}
class Sub extends Add {
	int res;
	Sub() {
		res = 0;
		System.out.println("Subraction of default value: "+res);
	}
	Sub(int x) {
		super(x);
		res = x;
		System.out.println("Subraction of Single value: "+res);
	}
	Sub(int x, int y) {
		super(x, y);
		res = x-y;
		System.out.println("Subraction of 2 values: "+res);		
	}
}
class Multiply extends Sub {
	int res;
	Multiply() {
		res = 1;
		System.out.println("Multiply of default value: "+res);
	}
	Multiply(int x) {
		super(x);
		res = x;
		System.out.println("Multiply of Single value: "+res);
	}
	Multiply(int x, int y) {
		super(x, y);
		res = x*y;
		System.out.println("Multiply of 2 values: "+res);		
	}
}

public class AssignmentMultiLevelConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply m = new Multiply(6, 5);
		Multiply m2 = new Multiply(6);
		Multiply m3 = new Multiply();

	}

}
