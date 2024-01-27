package com.gentech.methodsDemo;
class Math2 {
	void addition(int a, int b) {
		int res = a+b;
		System.out.println("Addition resutl: "+res);
	}
	void multiplication(int x, int y) {
		int res = x*y;
		System.out.println("Multiplication result: "+res);
	}
	
	void factorial(int n) {
		System.out.println("Parameterized Factorial of "+n+" is: ");
		int res = 1;
		for(int i=n; i>=1; i--) {
			res = res*i; 
		}
		System.out.println(res);
	}
	void factorial() {
		for(int i=5; i>=1; i--) {
			System.out.println("Non parameteized Factorial of "+i+" is: ");
			int res =1;
			for(int j=i; j>=1; j--) {
				res = res*j;
			}
			System.out.println(res);
		}
	}
}
public class MethodsWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math2 m = new Math2();
		m.addition(20, 50);
		m.multiplication(15, 5);
		m.addition(100, 50);
		m.multiplication(9, 19);
		System.out.println("----------------------------");
		m.factorial();
		System.out.println("----------------------------");
		int i = 5;
		while (i<=10) {
			m.factorial(i);
			i++;
		}
		
	}

}
