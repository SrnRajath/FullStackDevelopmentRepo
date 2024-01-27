package com.gentch.constructors;
class CapitalCity {
	CapitalCity(String name) {
		System.out.println("Capital city name: "+name);
	}
	CapitalCity(double population) {
		System.out.println("Capital city population: "+population);
	}
}
public class CapitalCityConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapitalCity c1 = new CapitalCity("Bangalore");
		CapitalCity c2 = new CapitalCity(20000.20);

	}

}
