package com.gentech.inheritanceConcepts;

class Wheels {
	Wheels(int num) {
		System.out.println("Output from Parent: it has " + num + " wheels");
	}
}

class Bike extends Wheels {
	Bike(String bikeName, int num) {
		super(num);
		System.out.println("it's a bike: " + bikeName);
	}
}

class Car extends Wheels {
	Car(String carName, int num) {
		super(num);
		System.out.println("It's a car: " + carName);
	}
}

public class AssignmentHierarchyInheritance {

	public static void main(String[] args) {
		Car c = new Car("Benz", 4);
		Bike B = new Bike("Hayabuza", 2);
	}

}
