package com.gentech.programs;

import java.util.Scanner;

public class ScannerToFindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact *= i;
		}

		System.out.println("factorial of num "+num+" is "+fact);
		sc.close();
	}

}
