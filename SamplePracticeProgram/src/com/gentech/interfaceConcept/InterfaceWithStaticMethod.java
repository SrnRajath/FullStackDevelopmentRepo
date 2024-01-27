package com.gentech.interfaceConcept;

interface Insurance {
	void showInsuranceType(String name);
	static void displayPremiumAmount(double amount) {
		System.out.println("Premium Amount of Insurance: "+amount);
	}
}

class Vehicle implements Insurance {
	public void showInsuranceType(String type) {
		System.out.println("Type od insurance: "+type);
	}
}
public class InterfaceWithStaticMethod {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.showInsuranceType("Auto Insurance");
		// TODO Auto-generated method stub
		Insurance.displayPremiumAmount(2500.25);
	}

}
