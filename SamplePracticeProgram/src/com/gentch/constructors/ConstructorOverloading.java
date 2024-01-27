package com.gentch.constructors;

class Student {
	Student(int rollNo) {
		System.out.println("Student Roll no: "+rollNo);
	}
	Student(String firstName) {
		System.out.println("Student First Name: "+firstName);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101);
		Student s2 = new Student("Santosh");
	}
}
