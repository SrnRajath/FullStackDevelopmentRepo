package com.gentech.classDemo;
class Student {
	static String firstName;
	static int age;
//	always static will execute first
	static {
		firstName="Santosh";
		showFn();
		showAge();
	}
	static void showFn() {
		System.out.println("First Name of Student: "+firstName);
	}
	static void showAge() {
		System.out.println("Age of the student: "+age);
	}
}

public class ExecutionOrderStaticVariableMethodsBlock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.age = 21;
		System.out.println("In main method, age value is: "+Student.age);
	}

}
