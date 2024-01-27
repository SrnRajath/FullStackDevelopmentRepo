package com.gentech.exceptionHandling;
class BasicMath {
	static void addition(int x, int y) {
		System.out.println("Addition result: "+(x+y));
	}
	
	static void subtraction(int x, int y) {
		System.out.println("Subtraction result: "+(x-y));
	}
	
	static void division(int x, int y) {
		int res = x/y;
		System.out.println("Division result: "+res);
	}
	
	static void multiplication(int x, int y) {
		System.out.println("Multiplication result: "+(x*y));
	}
	
	static void isEven(int x) {
		if(x%2==0)
			System.out.println(x+" is Even");
	}
	
	static void isOdd(int x) {
		if(x%2==1)
			System.out.println(x+" is odd");
	}
	
	static void isPositive(int x) {
		if(x>0)
			System.out.println(x+" is positive");
	}
	
	static void isNegative(int x) {
		if(x<0)
			System.out.println(x+" is negative");
	}
	
	static void averageValue(int x, int y) {
		int avg = (x+y)/2;
		System.out.println("Avg value: "+avg);
	}
	
	static void squareOfNum(int x) {
		int squ = (x*x);
		System.out.println("square of "+x+"is "+squ);
	}
}

public class ProgWithoutException {

	public static void main(String[] args) {
		BasicMath.addition(20,50);
		BasicMath.subtraction(20, 50);
		BasicMath.multiplication(15, 10);
		BasicMath.squareOfNum(5);
		BasicMath.division(450, 0);
		BasicMath.isEven(44);
		BasicMath.isOdd(61);
		BasicMath.isNegative(-92);
		BasicMath.isPositive(55);
	}

}
