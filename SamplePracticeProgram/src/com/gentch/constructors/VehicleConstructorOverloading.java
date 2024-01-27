package com.gentch.constructors;
class Vehicle {
	String regNo;
	int year;
	
	Vehicle(int year) {
		this.year = year;
		System.out.println("Constructor for year: "+year);
		
	}
	Vehicle(String reg) {
		regNo = reg;
		System.out.println("Constructor for reg: "+this.regNo);
	}
	
}

public class VehicleConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle(2024);
		Vehicle v2 = new Vehicle("KA-09JT7606");

	}

}
