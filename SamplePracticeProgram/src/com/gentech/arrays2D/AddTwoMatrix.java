package com.gentech.arrays2D;

public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{10,20,30},{40,50,60}};
		int b[][] = {{1,2,3},{4,5,6}};
		int res[][] = new int[a.length][a[0].length];
		if(a.length==b.length && a[0].length == b[0].length) {
			for(int i=0;i<a.length;i++) {
				for(int j=0; j<a[i].length; j++) {
					res[i][j] = (a[i][j]+b[i][j]);
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
