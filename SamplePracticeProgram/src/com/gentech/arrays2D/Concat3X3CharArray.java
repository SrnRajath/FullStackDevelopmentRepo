package com.gentech.arrays2D;

public class Concat3X3CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[][] = {
				{'a', 'b', 'c'},
				{'d', 'e', 'f'},
				{'g', 'h', 'i'}
		};
		String s="";
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				s+=c[i][j];
			}
		}
		System.out.println("concated characters as string: ");
		System.out.println(s);
	}

}
