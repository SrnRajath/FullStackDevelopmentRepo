package com.gentech.classDemo;
class ExecutionOrder {
	ExecutionOrder() {
		System.out.println("This is a no-args constructor");
	}
	{
		System.out.println("This is a instance block!!");
	}
	static {
		System.out.println("This is a static block!!!");
	}
}
public class StaticBlockVsInstanceBlockVsConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutionOrder eo = new ExecutionOrder();

	}

}
