package com.gentech.arrays2D;

public class Integer3X3ArrayTo1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{11, 12, 13},
				{21, 22, 23},
				{31, 32, 33}
		};
		int b[] = new int[a.length*a[0].length];
		int index=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				b[index] = a[i][j];
				index++;
			}
		}
		System.out.println("Printing 1D array: ");
		for(int k=0; k<b.length; k++) {
			System.out.print(b[k]+" ");
		}

	}

}
