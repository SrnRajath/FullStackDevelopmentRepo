package com.gentech.oopsConcepts.execute;

import com.gentech.oopsConcepts.P1.AccessSpecifierProtected;
import com.gentech.oopsConcepts.P1.IndependentClassInP1Package;
import com.gentech.oopsConcepts.P1.SubClassInP1Package;
import com.gentech.oopsConcepts.P2.IndependentClassInP2Package;
import com.gentech.oopsConcepts.P2.SubClassInP2Package;

public class ExecuteMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Execute AccessSpecifierProtected class constructor
		AccessSpecifierProtected a = new AccessSpecifierProtected();
		//Execute SubClassInP1Package class constructor
		SubClassInP1Package sp1 = new SubClassInP1Package();
		//Execute IndependentClassP1Package class constructor
		IndependentClassInP1Package iP1 = new IndependentClassInP1Package();
		//Execute IndependentClassP2Package class constructor
		IndependentClassInP2Package iP2 = new IndependentClassInP2Package();
		//Execute SubClassInP2Package class constructor
		SubClassInP2Package sp2 = new SubClassInP2Package();
	}
}
