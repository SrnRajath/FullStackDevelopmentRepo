package com.gentech.classDemo;
class Test1 {
	void addition(int x, int y) {
		System.out.println("Addition Restult: "+(x+y));
	}
}
class Test2 {
	static void multiplication(int x, int y) {
		Test1 t = new Test1();
		t.addition(20, 60);
		System.out.println("Multiplication Result: "+(x*y));
	}
}
public class StaticVsNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2.multiplication(12, 15);

	}

}
