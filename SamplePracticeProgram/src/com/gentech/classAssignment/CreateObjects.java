package com.gentech.classAssignment;

public class CreateObjects {

	String firstName;
	int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateObjects obj1 = new CreateObjects();
		obj1.firstName = "Rajath";
		obj1.age = 21;
		System.out.println("first Name: "+obj1.firstName);
		System.out.println("Age: "+obj1.age);
		CreateObjects obj2 = new CreateObjects();
		obj1.firstName = "Rahul Dravid";
		obj1.age = 30;
		System.out.println("first Name: "+obj2.firstName);
		System.out.println("Age: "+obj2.age);
	}

}
