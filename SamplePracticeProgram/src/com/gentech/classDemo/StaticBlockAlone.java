package com.gentech.classDemo;
class Demo {
	Demo() {
		System.out.println("it is a no-args constructor!!");
	}
	//Always static block executes first
	static {
		System.out.println("It is a static block !!!");
	}
	
}

public class StaticBlockAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();

	}

}
