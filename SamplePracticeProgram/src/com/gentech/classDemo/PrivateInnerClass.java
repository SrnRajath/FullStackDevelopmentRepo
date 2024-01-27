package com.gentech.classDemo;
class Outer2 {
	String firstName;
	Inner2 in = new Inner2();
	void showBranchName() {
		in.branchName="Computer";
		System.out.println("Branch Name: "+in.branchName);
	}
	void displayFirstName() {
		in.showFn();
	}
	
	private class Inner2 {
		String branchName;
		void showFn() {
			firstName = "Santosh";
			System.out.println(" First Name of student: "+firstName);
		}
	}
}

public class PrivateInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 outer = new Outer2();
		outer.showBranchName();
		outer.displayFirstName();
	}
}
