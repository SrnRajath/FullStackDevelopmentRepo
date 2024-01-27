package com.gentech.oopsConcepts.P1;

public class AccessSpecifierProtected {
	private int privateEle =100;
	int default_B=200;
	protected int protected_c = 300;
	public int public_d = 400;

	public AccessSpecifierProtected() {
		System.out.println("This is a AccessSpecifierProtected class");
		System.out.println("privateEle: "+privateEle);
		System.out.println("default_B: "+default_B);
		System.out.println("protected_c: "+protected_c);
		System.out.println("public_d: "+public_d);
		System.out.println("======================");
	}
}
