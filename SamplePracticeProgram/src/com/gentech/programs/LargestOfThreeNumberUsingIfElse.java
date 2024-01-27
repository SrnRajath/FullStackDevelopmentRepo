package com.gentech.programs;

public class LargestOfThreeNumberUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=10, c=6;
		if(a>b && a>c) {
			System.out.println("largest is "+a);
		}else if(b>a && b>c) {
			System.out.println("largest is "+b);
		}else {
			System.out.println("largest is "+c);
		}

	}

}
