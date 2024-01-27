package com.gentech.oopsConcepts.P2;

import com.gentech.oopsConcepts.P1.AccessSpecifierProtected;

public class IndependentClassInP2Package {
	AccessSpecifierProtected a = new AccessSpecifierProtected();
	public IndependentClassInP2Package() {
		System.out.println("It is SubClassInP1Package class constructor!!");
		//System.out.println("privateEle: "+p.privateEle);
		//System.out.println("default_B: "+a.default_B);
		//System.out.println("protected_c: "+a.protected_c);
		System.out.println("public_d: "+a.public_d);
		System.out.println("======================");
	}

}
