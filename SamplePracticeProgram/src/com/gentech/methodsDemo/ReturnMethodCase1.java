package com.gentech.methodsDemo;
class ReturnMethodC1 {
	int add(int a, int b) {
		int res = a+b;
		return res;
	}
	int sub(int a, int b) {
		int res = a-b;
		return res;
	}
	void multiplication(int a, int b) {
		int res = a*b;
		System.out.println("Multiplication result: "+res);
	}
}

public class ReturnMethodCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnMethodC1 rm = new ReturnMethodC1();
		int p = rm.add(5, 2);
		int q = rm.sub(25, 15);
		rm.multiplication(p, q);
		//or
		rm.multiplication(rm.add(10, 2), rm.sub(25, 15));

	}

}
