package com.gentech.inheritanceConcepts;
class Parent {
	void add(int x, int y) {
		System.out.println("parent add method: "+(x+y));
	}
}
class Child extends Parent {
	void subtract(int x, int y) {
		System.out.println("Child subtract method: "+(x-y));
	}
}
class GrandChild extends Child {
	void multiply(int x, int y) {
		System.out.println("GrandChild multiply method: "+(x*y));
	}
}

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild gc = new GrandChild();
		gc.add(10, 20);
		gc.subtract(30, 10);
		gc.multiply(2, 3);
	}
}
