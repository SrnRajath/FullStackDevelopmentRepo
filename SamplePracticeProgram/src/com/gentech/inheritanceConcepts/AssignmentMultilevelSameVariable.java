package com.gentech.inheritanceConcepts;
class SameVariable {
	String s;
	void display() {
		System.out.println("this is parent method"+s);
	}
}
class SameVariable1 extends SameVariable{
	String s;
	SameVariable1(String s1, String s2) {
		super.s = s1;
		this.s = s2;
	}
	void display1() {
		System.out.println("this is child method"+this.s);
	}
}
class SameVariable2 extends SameVariable1{
	String s;
	SameVariable2(String s1, String s2, String s3) {
		super(s1,s2);
		this.s = s3;
	}
	void display2() {
		System.out.println("this is grand child method"+this.s);		
	}
}

public class AssignmentMultilevelSameVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SameVariable2 sv2 = new SameVariable2("s1", "s2", "s3"); 
		sv2.display();
		sv2.display1();
		sv2.display2();
	}

}
