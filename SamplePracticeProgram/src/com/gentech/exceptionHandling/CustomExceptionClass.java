package com.gentech.exceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class CustomExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter Age value: ");
			int age = sc.nextInt();
			if(age<18) {
				throw new InvalidAgeException("Age should be more than 18 years");
			}
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
