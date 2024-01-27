package com.gentech.arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare and assign elements
		int[] x = {100, 200, 300, 400, 500, 600};
		
		for(int a: x) {
			System.out.println(a);
		}
		//read using loop 
        for(int i=x.length-1; i>=0; i--) {
        	System.out.println(i);
        }
	}

}
