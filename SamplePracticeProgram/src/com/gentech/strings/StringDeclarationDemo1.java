package com.gentech.strings;

public class StringDeclarationDemo1 {

	public static void main(String[] args) {
		String s = "Java";
		System.out.println("initial value: "+s);
		s.concat(" Progamming");
		System.out.println("after 1st concatenation: "+s);
		s.concat(" Language");
		System.out.println("after 2nd concatenation: "+s);
		System.out.println("all the output print only Java hence proved string is immutable");

	}

}
