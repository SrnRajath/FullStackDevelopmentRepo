package com.gentech.inheritanceConcepts;
class ParentHierarch {
	void parentMethod() {
		System.out.println("this is parent method");
	}
}
class Child1 extends ParentHierarch {
	void child1Method() {
		System.out.println("this is a child one method");
	}
}

class Child2 extends ParentHierarch {
	void child2Method() {
		System.out.println("this is a child two method");
	}
}

public class HierarchialInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		c1.child1Method();
		c2.child2Method();
		c1.parentMethod();
		c2.parentMethod();
	}
}
