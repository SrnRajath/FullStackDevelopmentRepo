package com.gentech.strings;

public class StringInConstantPool {

	public static void main(String[] args) {
		//below 3 lines create obj in constant pool
		String s1 = "Java";
		String s2 = "java";
		String s3 = "Java";
		
		//Below 3 lines create obj in heap memory
		String s4 = new String("Java");
		String s5 = new String("java");
		String s6 = new String("Java");
		
		System.out.println("Comparing string values to "
				+ "understand heap and constant pool");
		
		System.out.println("(s1==s2)"+(s1==s2));
		System.out.println("(s1==s3)"+(s1==s3));
		System.out.println("(s1==s4)"+(s1==s4));
		System.out.println("(s4==s6)"+(s4==s6));		
	}
}
