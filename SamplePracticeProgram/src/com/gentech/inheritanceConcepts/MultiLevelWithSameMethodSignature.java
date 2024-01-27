package com.gentech.inheritanceConcepts;
class CapitalCity1 {
	void showCity(String capital) {
		System.out.println("Capital city: "+capital);
	}
}

class MetroCity1 extends CapitalCity1 {
	MetroCity1(String cityName) {
		super.showCity(cityName);
	}
	void showCity(String metro) {
		System.out.println("Metro city: "+metro);
	}
}

class PalaceCity extends MetroCity1 {
	public PalaceCity(String cap, String met) {
		// TODO Auto-generated constructor stub
		super(met);
		super.showCity(cap);
	}
	void showCity(String palace) {
		System.out.println("Palace city: "+palace);
	}
}

public class MultiLevelWithSameMethodSignature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalaceCity p = new PalaceCity("Chennai", "Bangalore");
		p.showCity("Mysore");
	}
}
