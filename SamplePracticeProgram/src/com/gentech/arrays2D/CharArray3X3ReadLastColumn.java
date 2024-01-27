package com.gentech.arrays2D;

public class CharArray3X3ReadLastColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[][] = {
				{'a', 'b', 'c'},
				{'d', 'e', 'f'},
				{'g', 'h', 'i'}
		};
		String s="";
		for(int i=0; i<c.length; i++) {
			s+=c[i][c[i].length-1];
		}
		
		System.out.println("Concate last column: ");
		System.out.println(s);
	}

}
