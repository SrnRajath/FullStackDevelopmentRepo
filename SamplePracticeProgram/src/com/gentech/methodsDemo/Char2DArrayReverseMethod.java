package com.gentech.methodsDemo;
class DisplayReverse {
	void reverseCharDisplay(char[][] a) {
		for(int i=a.length-1; i>=0; i--) {
			for(int j=a[i].length-1; j>=0; j--) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class Char2DArrayReverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[][] = {
				{'a', 'b', 'c'},
				{'d', 'e', 'f'},
				{'g', 'h', 'i'}
		};
		
		DisplayReverse reverse = new DisplayReverse();
		reverse.reverseCharDisplay(ch);

	}

}
