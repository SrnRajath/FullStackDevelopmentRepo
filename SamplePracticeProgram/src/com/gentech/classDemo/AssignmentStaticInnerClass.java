package com.gentech.classDemo;
class OuterClass{
	static class InnerClass {
		int age;
		String s;
		String getString() {
			return s;
		}
		int getAge() {
			return age;
		}
	}
}

public class AssignmentStaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.InnerClass in = new OuterClass.InnerClass();
		in.age=5;
		in.s="test inner static";
		System.out.println(in.getAge());
		System.out.println(in.getString());
		

	}

}
