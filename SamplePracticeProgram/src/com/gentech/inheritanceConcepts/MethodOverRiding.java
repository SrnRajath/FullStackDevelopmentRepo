package com.gentech.inheritanceConcepts;
class CapitalCity {
	void showCityName(String capitalCityNm) {
		System.out.println("Capital city in parent class: "+capitalCityNm);
	}
}
class MetroCity extends CapitalCity {
	public MetroCity(String cityNm) {
		// TODO Auto-generated constructor stub
		super.showCityName(cityNm);
	}
	void showCityName(String metroCityNm) {
		System.out.println("Metro city name in sub class: "+metroCityNm);
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetroCity m = new MetroCity("Bangalore");
		m.showCityName("Chennai");

	}

}
