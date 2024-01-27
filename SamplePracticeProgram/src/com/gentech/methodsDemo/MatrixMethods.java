package com.gentech.methodsDemo;

class MatrixManipulation {
	int[][] additionMatrix(int[][] x, int[][] y) {
		int res[][] = new int[x.length][x[0].length];
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				res[i][j] = x[i][j]+y[i][j];
			}
		}
		return res;
	}
}
public class MatrixMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixManipulation mm = new MatrixManipulation();
		int a[][] = {
				{2,4,6},
				{8,10,12},
				{14,16,18}
		};
		int b[][]= {
				{1,3,5},
				{7,9,11},
				{13,15,17}
		};
		int c[][] = mm.additionMatrix(a, b);
		System.out.println("++++++++++++printing addition++++++++++++++++++++");
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++printing transpose++++++++++++++++++++");
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.print(c[j][i]+" ");
			}
			System.out.println();
		}

	}

}
