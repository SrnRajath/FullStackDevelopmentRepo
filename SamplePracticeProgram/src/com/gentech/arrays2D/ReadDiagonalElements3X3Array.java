package com.gentech.arrays2D;

/**
 * Assignment 5
 */
public class ReadDiagonalElements3X3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][] = {
				{11, 12, 13},
				{21, 22, 23},
				{31, 32, 33}
				};
		System.out.println("-----printing top to down-----");
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length;j++) {
				if(i==j) {
					System.out.print(c[i][j]+" ");
				}
			}
		}
		System.out.println();
		System.out.println("-----printing down to top-----");
		for(int k=c.length-1;k>=0;k--) {
			for(int l=0; l<c[k].length; l++) {
				if((k+l)==(c.length-1)) {
					System.out.print(c[k][l]+" ");
				}
			}
		}

	}

}
