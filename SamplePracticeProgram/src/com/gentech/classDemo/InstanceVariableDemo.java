package com.gentech.classDemo;

public class InstanceVariableDemo {
	String firstName;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableDemo obj1 = new InstanceVariableDemo();
		obj1.firstName = "Santosh";
		obj1.age = 21;
		System.out.println("First Name :"+obj1.firstName);
		System.out.println("Age :"+obj1.age);

	}

}
