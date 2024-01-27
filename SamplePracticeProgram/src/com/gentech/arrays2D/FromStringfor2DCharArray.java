package com.gentech.arrays2D;

public class FromStringfor2DCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[][]= {{'a','b','c'},{'d','e','f'}};
		String str="";
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<ch[i].length; j++) {
				str=str+ch[i][j];
			}
		}
		System.out.println(str);
	}

}
