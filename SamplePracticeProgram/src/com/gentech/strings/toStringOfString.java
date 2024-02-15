package com.gentech.strings;
class Student {
	String firstName;
	int age;
	Student(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "First Name is "+firstName+" and age is "+age;
	}
}

public class toStringOfString {
	public static void main(String[] args) {
		Student stu = new Student("Santosh", 21);
		System.out.println(stu);
		System.out.println(stu.toString());
	}
}
