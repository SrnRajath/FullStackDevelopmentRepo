package com.gentech.patterns;

public class InverseRightTriangle5 {
/*
 * 	5 5 5 5 5
	5 5 5 5
	5 5 5
	5 5
	5
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print("5 ");
			}
			System.out.println("");
		}

	}

}
