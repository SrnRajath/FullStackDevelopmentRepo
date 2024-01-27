package com.gentech.inheritanceConcepts;
class ParentProperty {
	public ParentProperty() {
		System.out.println("You have inherited Grand parent property");
	}
}
class ChildProperty extends ParentProperty {
	public ChildProperty() {
		System.out.println("You have inherited parent property too");
	}
}
class GrandChildProperty extends ChildProperty {
	public GrandChildProperty() {
		System.out.println("You have made some property as well");
	}
}

public class AssignmentMultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChildProperty gcp = new GrandChildProperty();

	}

}
