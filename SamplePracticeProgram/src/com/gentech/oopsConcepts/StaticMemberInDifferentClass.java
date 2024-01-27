package com.gentech.oopsConcepts;
class Maths {
	static String mathsType;
	static void addition(int x, int y) {
		int res=x+y;
		System.out.println("Additional result: "+res);
	}
}

public class StaticMemberInDifferentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Access static members using <className>.<Variable/MethodName>
		Maths.mathsType = "Algebra";
		System.out.println("Maths type: "+Maths.mathsType);
		Maths.addition(20, 50);
	}
}
