package com.gentech.arrays2D;

public class Read3X3StringArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] s = {
				{"I", "am", "Indian"},
				{"I", "Love", "India"},
				{"India", "is", "Beautiful"}
		};
		System.out.println("Printing string matrix in reverse order: ");
		System.out.println();
		for(int i=s.length-1; i>=0; i--) {
			for(int j=s[i].length-1; j>=0; j--) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
	}

}
