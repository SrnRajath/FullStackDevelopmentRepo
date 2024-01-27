package com.gentech.arrays;

public class SumDivisibleBy3from50To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		for(int i=50;i<=100;i++)
		{
			if(i%3==0)
			{
		//		System.out.println(i);
				size++;
			}
		}
		int x[]=new int[size];
		int k=0;
		for(int j=50;j<=100;j++)
		{
			if(j%3==0)
			{
				x[k]=j;
				k++;
			}
		
		}
		int arraysum = 0;
		for(int z=0;z<size;z++)
		{
	//		System.out.println(x[z]);
			arraysum=arraysum+x[z];
		}
		System.out.println("sum"+arraysum);
		
		
	}

}
