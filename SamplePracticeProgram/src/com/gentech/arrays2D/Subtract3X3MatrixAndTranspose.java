package com.gentech.arrays2D;

public class Subtract3X3MatrixAndTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}	
		};
		int b[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		int c[][] = new int[b[0].length][b.length];
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				c[j][i] = a[i][j]-b[i][j];
			}
		}
		
		System.out.println("Transposed matrix");
		for(int k=0; k<c.length; k++) {
			for(int l=0; l<c[k].length; l++) {
				System.out.print(c[k][l]+" ");
			}
			System.out.println();
		}
	}

}
