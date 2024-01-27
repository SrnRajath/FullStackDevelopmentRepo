package com.gentech.arrays2D;

public class ConcatenateString3X3Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] s = {
				{"I", "am", "Indian"},
				{"I", "Love", "India"},
				{"India", "is", "Beautiful"}
		};
		
		String sentence = "";
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[i].length; j++) {
				sentence+=(s[i][j]+" ");
			}
		}
		System.out.println("Sentence: ");
		System.out.println(sentence);
	}

}
