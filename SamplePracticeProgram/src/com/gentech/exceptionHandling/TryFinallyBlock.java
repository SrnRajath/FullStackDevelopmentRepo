package com.gentech.exceptionHandling;
class BasicMath2 {
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
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e); //prints the exception class name
			System.out.println(e.getMessage()); //prints the exception log
			e.printStackTrace(); //prints the entire stack trace
		} finally {
			System.out.println("It executes always");
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


public class TryFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicMath2.addition(20,50);
		BasicMath2.subtraction(20, 50);
		BasicMath2.multiplication(15, 10);
		BasicMath2.squareOfNum(5);
		BasicMath2.division(450, 0);
		BasicMath2.isEven(44);
		BasicMath2.isOdd(61);
		BasicMath2.isNegative(-92);
		BasicMath2.isPositive(55);
	}

}
