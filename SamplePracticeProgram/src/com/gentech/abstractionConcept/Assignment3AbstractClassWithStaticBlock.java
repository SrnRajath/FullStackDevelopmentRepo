package com.gentech.abstractionConcept;
abstract class Company {
	static {
		System.out.println("this is static block of company");
	}
	static {
		System.out.println("Here we go second static block");
	}
}

class Visa extends Company {
	
}

public class Assignment3AbstractClassWithStaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Visa();

	}

}
