package com.gentech.designPatterns;
class Math2{
	//Step3: create a static object 
	static Math2 obj = null;
	//Step1: create private no-args constructor
	private Math2() {
		
	}
	//Step2: create a static method to return class object
	public static Math2 getInstance() {
		if(obj==null) {
			obj = new Math2();
		}
		return obj;
	}
	void addition(int x, int y) {
		int res = x+y;
		System.out.println("Additon Result: "+res);
	}
	void multiplication(int x, int y) {
		int res = (x*y);
		System.out.println("Multiplication Result: "+res);
	}
}

public class ApplyingSingleTonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math2 m1 = Math2.getInstance();
		m1.addition(25,50);
		m1.multiplication(10, 9);
		Math2 m2 = Math2.getInstance();
		m2.addition(50,100);
		m2.multiplication(25, 25);
		Math2 m3 = Math2.getInstance();
		m3.addition(45, 200);
		m3.multiplication(100, 35);
		if(m1==m2 && m2==m3) {
			System.out.println("all objects has same reference");
		} else {
			System.out.println("all objects doesn't have same reference");
		}
	}
}
