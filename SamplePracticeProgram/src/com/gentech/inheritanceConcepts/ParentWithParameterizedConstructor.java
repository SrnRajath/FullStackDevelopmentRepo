package com.gentech.inheritanceConcepts;
class Student {
	public Student(String name, String course) {
		// TODO Auto-generated constructor stub
		System.out.println("Student Name: "+name);
		System.out.println("Course Name: "+course);
	}
}

class Library extends Student {
	int age;
	public Library(String fn, String co, int age) {
		// we use super to access parent constructor
		super(fn, co);
		this.age = age;
		System.out.println("Student age: "+this.age);
	}
}

public class ParentWithParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lo = new Library("Santosh", "Medical", 30);
		Library l2 = new Library("Richard", "Science", 24);
	}
}
