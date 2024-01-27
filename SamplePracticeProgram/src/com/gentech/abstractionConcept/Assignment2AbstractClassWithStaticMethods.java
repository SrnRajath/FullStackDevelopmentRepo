package com.gentech.abstractionConcept;

abstract class Brokerage {
	static void percentage(int amount, int percent) {
		float res = amount*percent/100;
		System.out.println("Brokerage to be paid: "+res);
	}
	static void tax(int amount, int tax) {
		float res = amount+(amount*tax/100);
		System.out.println("Total amount after tax: "+res);
	}
}

public class Assignment2AbstractClassWithStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brokerage.percentage(100, 10);
		Brokerage.tax(2000, 20);
	}

}
