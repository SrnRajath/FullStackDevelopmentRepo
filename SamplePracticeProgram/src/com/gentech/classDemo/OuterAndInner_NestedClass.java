package com.gentech.classDemo;
class Outer
{
	String firstName;
	Inner inner = new Inner();
	void showAge() {
		inner.age=21;
		System.out.println("accessing inner class value is possible "
				+ "only by instance");
		System.out.println(inner.age);
	}
	class Inner {
		int age;
		void showFirstName() {
			firstName = "Santosh";
			System.out.println("First name of student: "+firstName);
		}
	}
}

public class OuterAndInner_NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.showAge();
		outer.inner.showFirstName();

	}

}
