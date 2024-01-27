package com.gentech.interfaceConcept;
interface Employee {
	void showEmployeeName(String name);
	default void displayTobName(String name) {
		System.out.println("Tob name of employee: "+name);
	}
}

class Department implements Employee {

	@Override
	public void showEmployeeName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Employee name: "+name);
	}
}

public class InterfaceWithDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d = new Department();
		d.showEmployeeName("Santhosh");
		d.displayTobName("Manager");

	}

}
