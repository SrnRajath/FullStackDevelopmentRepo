package com.gentech.abstractionConcept;
abstract class Organization {
	{
		System.out.println("this is instance block of company");
	}
	{
		System.out.println("Here we go second instance block");
	}
}

class Anet extends Organization {
	
}


public class Assignment4AbstractClassInstanceBlockAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Anet();
	}

}
