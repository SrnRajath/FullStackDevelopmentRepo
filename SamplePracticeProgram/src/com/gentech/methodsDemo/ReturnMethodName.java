package com.gentech.methodsDemo;
class ReturnName{
	String getName(String name) {
		return "Hello "+ name;
	}
}

public class ReturnMethodName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnName rn = new ReturnName();
		String s = rn.getName("Santosh");
		System.out.println(s);
	}

}
