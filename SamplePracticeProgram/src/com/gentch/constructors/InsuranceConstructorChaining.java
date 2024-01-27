package com.gentch.constructors;
class Insurance {
	Insurance() {
		this(20000);
		System.out.println("Default constructor called parameterized constructor");
		System.out.println("--------------------------------------------");
	}
	Insurance(int amount) {
		System.out.println("Amount insured: "+amount);
	}
}
public class InsuranceConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Insurance();
		Insurance i2 = new Insurance(30000);

	}

}
