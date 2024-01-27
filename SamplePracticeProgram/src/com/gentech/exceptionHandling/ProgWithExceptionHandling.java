package com.gentech.exceptionHandling;
class BasicMath1 {
	static void addition(int x, int y) {
		System.out.println("Addition result: "+(x+y));
	}
	
	static void subtraction(int x, int y) {
		System.out.println("Subtraction result: "+(x-y));
	}
	
	static void division(int x, int y) {
		try {
			int res = x/y;
			System.out.println("Division result: "+res);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("it executes always");
		}
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


public class ProgWithExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicMath1.addition(20,50);
		BasicMath1.subtraction(20, 50);
		BasicMath1.multiplication(15, 10);
		BasicMath1.squareOfNum(5);
		BasicMath1.division(450, 0);
		BasicMath1.isEven(44);
		BasicMath1.isOdd(61);
		BasicMath1.isNegative(-92);
		BasicMath1.isPositive(55);

	}

}
