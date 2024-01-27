package com.gentech.oopsConcepts.P2;

import com.gentech.oopsConcepts.P1.AccessSpecifierProtected;

public class SubClassInP2Package extends AccessSpecifierProtected{
	public SubClassInP2Package() {
		System.out.println("It is SubClassInP1Package class constructor!!");
		//System.out.println("privateEle: "+privateEle);
		//System.out.println("default_B: "+default_B);
		System.out.println("protected_c: "+protected_c);
		System.out.println("public_d: "+public_d);
		System.out.println("======================");
	}
}
