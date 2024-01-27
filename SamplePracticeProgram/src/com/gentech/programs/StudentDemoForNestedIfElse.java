package com.gentech.programs;

public class StudentDemoForNestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=44;
		if(marks>=70) {
			System.out.println("passed in Distinction");
		} else if((marks<70) && (marks>=60)) {
			System.out.println("passed in First class");
		} else if((marks<60) && (marks>=50)) {
			System.out.println("passed in Second class");
		} else if((marks<50) && (marks>=35)) {
			System.out.println("passed");
		} else if((marks<35) && (marks>=0)) {
			System.out.println("failed");
		} else {
			System.out.println("invalid input");
		}

	}

}
