package com.gentech.arrays;

public class DivisibleBy6From100To1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 0;
		for (int i = 100; i >= 1; i--) {
			if (i%6==0) {
				size++;
			}
		}
		int a[] = new int[size];
		int index=0;
		for(int j=100; j>=1; j--) {
			if(j%6==0) {
				a[index] = j;
				index++;
			}
			
		}
		for(int k=0; k<a.length; k++) {
			System.out.println(a[k]);
		}
	}
}
