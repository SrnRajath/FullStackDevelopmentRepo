package com.gentech.patterns;

public class PatternSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # # # # #
		   # # # # #
		   # # # # #
		   # # # # #
		 */
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("----------------Printing using while loop-------------");
		int i=1;
		while(i<=4) {
			int j=1;
			while(j<=5) {
				System.out.print("# ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("----------------Printing using do while loop-------------");
		int j=1;
		do {
			int k=1;
			do {
				System.out.print("# ");
				k++;
			}while(k<=5);
			System.out.println();
			j++;
		}while(j<=4);
	}

}
