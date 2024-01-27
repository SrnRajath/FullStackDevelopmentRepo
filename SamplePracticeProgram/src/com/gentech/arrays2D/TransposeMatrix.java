package com.gentech.arrays2D;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{11, 12, 13},
				{21, 22, 23},
				{31, 32, 33}
		};
		int b[][] = new int[a[0].length][a.length];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		System.out.println("Transposed matrix");
		for(int k=0; k<b.length; k++) {
			for(int l=0; l<b[k].length; l++) {
				System.out.print(b[k][l]+" ");
			}
			System.out.println();
		}
	}

}
