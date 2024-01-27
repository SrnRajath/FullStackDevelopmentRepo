package com.gentech.designPatterns;
class Math1{
	void addition(int x, int y) {
		int res = x+y;
		System.out.println("Additon Result: "+res);
	}
	void multiplication(int x, int y) {
		int res = (x*y);
		System.out.println("Multiplication Result: "+res);
	}
}

public class BeforeSingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Before applying single ton we are creating multiple objects
		//which takes memory
		Math1 m1 = new Math1();
		m1.addition(25,50);
		m1.multiplication(10, 9);
		Math1 m2 = new Math1();
		m2.addition(50,100);
		m2.multiplication(25, 25);
		Math1 m3 = new Math1();
		m3.addition(45, 200);
		m3.multiplication(100, 35);

	}

}
