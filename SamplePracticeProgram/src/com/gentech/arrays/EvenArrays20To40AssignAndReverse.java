package com.gentech.arrays;

public class EvenArrays20To40AssignAndReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		for(int i=20;i<=40;i++) {
			if(i%2==0) {
				size++;
			}
		}
		System.out.println("# of elements: "+size);
		int x[]=new int[size];
		int k=0;
		for(int j=20; j<=40; j++) {
			if(j%2==0) {
				x[k]=j;
				k++;
			}
		}
		//Read in reverse order
		for(int z=x.length-1;z>=0;z--) {
			System.out.println(x[z]);
		}

	}

}
