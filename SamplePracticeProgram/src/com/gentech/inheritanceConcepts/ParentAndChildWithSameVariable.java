package com.gentech.inheritanceConcepts;
class Employee {
	String name;
	void show() {
		System.out.println("Employee Name: "+name);
	}
}
class department extends Employee {
	String name;
	department(String ename, String dname) {
		super.name = ename;
		this.name = dname;
	}
	void display() {
		System.out.println("Department name: "+name);
	}
}

public class ParentAndChildWithSameVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		department d = new department("Santosh", "Research");
		d.display();
		d.show();
	}
}
