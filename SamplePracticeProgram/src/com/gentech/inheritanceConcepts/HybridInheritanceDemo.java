package com.gentech.inheritanceConcepts;
class Parent1 {
	void add(int x, int y) {
		System.out.println("parent add method: "+(x+y));
	}
}
class ChildOfParent1 extends Parent {
	void subtract(int x, int y) {
		System.out.println("Child subtract method: "+(x-y));
	}
}
class GrandChild1 extends Child {
	void multiply(int x, int y) {
		System.out.println("GrandChild multiply method: "+(x*y));
	}
}
class ChildOfParent2 extends Parent {
	void division(int x, int y) {
		System.out.println("Child2 division method: "+(x/y));
	}
}

public class HybridInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild1 gc = new GrandChild1();
		gc.add(10, 20);
		gc.subtract(30, 10);
		gc.multiply(2, 3);
		ChildOfParent2 c2 = new ChildOfParent2();
		c2.division(400, 10);

	}

}
