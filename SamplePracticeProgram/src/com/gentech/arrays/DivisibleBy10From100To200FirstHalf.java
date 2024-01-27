package com.gentech.arrays;

public class DivisibleBy10From100To200FirstHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		for(int i=100; i<=200; i++) {
			if(i%10==0) {
				size++;
			}
		}
		int a[] = new int[size];
		int index=0;
		for(int j=100; j<=200; j++) {
			if(j%10==0) {
				a[index]=j;
				index++;
			}
		}
		int half = (size%2==0)? size/2 : (size/2)+1; 
		for(int k=0; k<half; k++) {
			System.out.println(a[k]);
		}

	}

}
