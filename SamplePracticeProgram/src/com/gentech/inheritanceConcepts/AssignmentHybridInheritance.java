package com.gentech.inheritanceConcepts;
class Calculator {
	int add(int x, int y) {
		System.out.println("Calling add from calculator class");
		int res = x+y;
		return res;
	}
}
class OldTax extends Calculator{
	int deduction(int x, int y) {
		System.out.println("Calling deductions from OldTax class ");
		int res = x-y;
		return res;
	}
}
class NewTax extends Calculator {
	int tax(int x, int y) {
		int res = add(x,y)-(x-y)/2;
		return res;
	}
}
class Computation extends OldTax {
	int totalTax(int addA, int addB, int dedB, int dedA) {
		System.out.println("Grand child computation for old tax");
		int res = add(addA, addB) + deduction(dedB, dedA);
		return res;
	}
}
public class AssignmentHybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computation c = new Computation();
		System.out.println("Tax from old regime: "+c.totalTax(10, 5, 6, 4));
		NewTax t = new NewTax();
		System.out.println("Tax for new regime: "+t.tax(100, 20));

	}

}
