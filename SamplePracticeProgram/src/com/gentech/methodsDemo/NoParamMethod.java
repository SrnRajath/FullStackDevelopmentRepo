package com.gentech.methodsDemo;
class Math1{
	void addition() {
		int x,y,res;
		x=10; y=20; 
		res = x+y;
		System.out.println("Addition result: "+res);
	}
	void multiplication() {
		int x,y,res;
		x=10; y=20; 
		res = x*y;
		System.out.println("Multiplication result: "+res);
	}
}

public class NoParamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math1 m = new Math1();
		m.addition();
		m.multiplication();

	}

}
