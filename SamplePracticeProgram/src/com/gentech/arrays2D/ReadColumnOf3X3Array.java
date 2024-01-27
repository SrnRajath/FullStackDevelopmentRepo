package com.gentech.arrays2D;
/**
 * Assignment 4,
 */
public class ReadColumnOf3X3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int middle = b[0].length/2;
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i][middle]+" ");
		}

	}

}
