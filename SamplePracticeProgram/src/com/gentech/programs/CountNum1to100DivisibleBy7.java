package com.gentech.programs;

public class CountNum1to100DivisibleBy7 {

	public static void main(String[] args) {
		// count of number between 1 to 100 divisible by 7
		int count=0;
		for(int i=0; i<=100; i++) {
			if(i%7==0) {
				count = count+1;
			}
		}
		System.out.println(count);
	}
}
