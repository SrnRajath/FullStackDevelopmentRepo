package com.gentech.methodsDemo;
class MatrixSubSum {
	void subtractAndSum(int[][] a, int[][] b) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum = sum + (a[i][j]-b[i][j]);
			}
		}
		System.out.println("sum of all number after subtraction: "+sum);
	}
}

public class MatrixSubtractionAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{5, 5, 5},
				{6, 6, 6},
				{7, 7, 7},
		};
		int[][]b = {
				{4, 4, 4},
				{5, 5, 5},
				{6, 6, 6}
		};
		MatrixSubSum mss = new MatrixSubSum();
		mss.subtractAndSum(a, b);
	}

}
