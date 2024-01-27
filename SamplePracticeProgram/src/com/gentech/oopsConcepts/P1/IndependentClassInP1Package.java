package com.gentech.oopsConcepts.P1;

public class IndependentClassInP1Package {
	AccessSpecifierProtected p = new AccessSpecifierProtected();
	public IndependentClassInP1Package() {
		System.out.println("It is SubClassInP1Package class constructor!!");
		//System.out.println("privateEle: "+p.privateEle);
		System.out.println("default_B: "+p.default_B);
		System.out.println("protected_c: "+p.protected_c);
		System.out.println("public_d: "+p.public_d);
		System.out.println("======================");
	}
}
