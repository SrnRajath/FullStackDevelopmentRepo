package com.gentech.patterns;

public class PatternRightTriangle {
	/*
	 * 1
	   1 2
	   1 2 3
	   1 2 3 4 
	   1 2 3 4 5
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------using while loop-----------------");
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=i) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("---------------using do while loop-----------------");
		int j=1;
		do {
			int k=1;
			do {
				System.out.print(k+" ");
				k++;
			}while(k<=j);
			System.out.println();
			j++;
		}while(j<=5);
	}

}
