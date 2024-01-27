package com.gentech.inheritanceConcepts;
class SameMethod1 {
	void show() {
		System.out.println("this is parent method");
	}
}
class SameMethod2 extends SameMethod1{
	SameMethod2() {
		super.show();
	}
	void show() {
		System.out.println("this is child method");
	}
}
class SameMethod3 extends SameMethod2{
	SameMethod3() {
		super.show();
	}
	void show() {
		System.out.println("this is grand child method");
	}
}
public class AssignmentMultilevelSameMethodName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SameMethod3 s3 = new SameMethod3();
		s3.show();

	}

}
