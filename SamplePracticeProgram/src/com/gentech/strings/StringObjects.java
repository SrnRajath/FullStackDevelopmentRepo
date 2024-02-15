package com.gentech.strings;

public class StringObjects {

	public static void main(String[] args) {
		String s1 = new String();
		String s2 = new String("Welcome");
		String s3 = new String("Hi");
		String s4 = new String(s3);
		char[] ch = {'a', 's', 'd', 'f'};
		String s5 = new String(ch);
		StringBuffer sb = new StringBuffer("Welcome");
		String s6 = new String(sb);
		StringBuilder build = new StringBuilder("Builder");
		String s7 = new String(build);
	}
}
