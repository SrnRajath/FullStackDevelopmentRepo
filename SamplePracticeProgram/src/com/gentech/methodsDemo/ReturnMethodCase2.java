package com.gentech.methodsDemo;
class ReturnMethods {
	int add(int a, int b) {
		int res = a+b;
		return res;
	}
	int sub(int a, int b) {
		int res = a-b;
		return res;
	}
	void multiplicationAddSub(int x, int y) {
		int a = add(x,y);
		int b = sub(x,y);
		int res = a*b;
		System.out.println("multiplication result: "+res);
	}
}

public class ReturnMethodCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnMethods rm = new ReturnMethods();
		rm.multiplicationAddSub(5, 2);

	}

}
