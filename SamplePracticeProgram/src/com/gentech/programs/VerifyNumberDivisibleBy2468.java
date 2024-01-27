package com.gentech.programs;

public class VerifyNumberDivisibleBy2468 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=24;
		if ((num%2==0) && (num%4==0) && (num%6==0) && ((num%8==0)))
		{
			System.out.println("Number is divisible by 2,4,6 and 8");
		}
		else {
			System.out.println("Number is not divisible by 2,4,6 and 8");
		}
	

	}

}
