package com.gentech.arrays2D;
/**
 * Assignment Number 1,2,4
 */
public class ReadRowof3X3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println("------Displaying 1st row elements-------");
		for(int i=0; i<a[0].length; i++) {
			System.out.print(a[0][i]+" ");
		}
		System.out.println();
		System.out.println("------Displaying last row elements------");
		int last = a.length-1;
		for(int i=0; i<a[last].length;i++) {
			System.out.print(a[last][i]+" ");
		}
		System.out.println();
		System.out.println("------Displaying middle row elements------");
		int middle = a.length/2;
		for(int i=0; i<a[middle].length;i++) {
			System.out.print(a[middle][i]+" ");
		}
	}

}
