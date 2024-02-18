package com.gentech.collections;

public class WrapperClass {
	static void autoboxing() {
		System.out.println("============autoboxing==========");
		int a = 10;
		Integer b = a;
		Integer c = Integer.valueOf(a);
		String s = String.valueOf(a);
		System.out.println("Integer b: "+b);
		System.out.println("Integer c: "+c);
		System.out.println("String s: "+s);
	};
	
	static void unboxing() {
		System.out.println("============unboxing===========");
		Integer a = Integer.valueOf(10);
		int b = a.intValue();
		int c = a;
		System.out.println("int b: "+b);
		System.out.println("int c: "+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		autoboxing();
		unboxing();
	}
}
