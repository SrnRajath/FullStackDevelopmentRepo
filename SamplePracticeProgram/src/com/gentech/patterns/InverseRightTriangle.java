package com.gentech.patterns;

public class InverseRightTriangle {
	/*
	 * 	1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=6-i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
