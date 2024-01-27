package com.gentech.inheritanceConcepts;
class Math1 {
	void add(int a, int b) {
		System.out.println("Addition result: "+(a+b));
	}
}
class Math2 extends Math1 {
	void subtract(int x, int y) {
		System.out.println("Subtraction result: "+(x-y));
	}
}

public class SimpleInheitanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math2 m2 = new Math2();
		//child class accessing parent method
		m2.add(5, 5);
		m2.subtract(7, 2);
	}

}
