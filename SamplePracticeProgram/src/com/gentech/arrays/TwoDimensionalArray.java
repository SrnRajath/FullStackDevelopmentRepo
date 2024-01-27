package com.gentech.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Declare and assign
		int x[][] = {{100,200,300},{400,500,600},{700,800,900}};
		//Read Elements using for each
		for(int[] i:x) {
			for(int j:i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
