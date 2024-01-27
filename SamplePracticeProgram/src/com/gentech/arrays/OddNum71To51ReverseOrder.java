package com.gentech.arrays;

public class OddNum71To51ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		for(int i=71;i>=51;i--)
		{
			if(i%2==1)
			{
				size++;
	//			System.out.println(i);
			}
		}
		System.out.println(size);
		int x[]=new int[size];
		int k=0;
		for(int j=71;j>=51;j--)
		{
			if(j%2==1)
			{
				x[k]=j;
				k=k+1;
			}
		}
		for(int z=x.length-1;z>=0;z--)

		{
			System.out.println(x[z]);
		}
	}

}
