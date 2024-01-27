package com.gentech.classDemo;
class OuterForPrivateInner{
	Inner in = new Inner();
	void setAge(int ag) {
		
		in.age = ag;
	}
	void setName(String str) {
		in.name = str;
	}
	int getAge() {
		return in.age;
	}
	String getName() {
		return in.name();
	}
	private class Inner {
		int age;
		String name;
		String name() {
			return name;
		}
	}
}

public class AssignmentPrivateInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterForPrivateInner out = new OuterForPrivateInner();
		out.setAge(2);
		out.setName("Test assignment to private inner class entity");
		System.out.println("Age: "+out.getAge());
		System.out.println("Name: "+out.getName());
	}

}
