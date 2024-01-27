package com.gentech.classAssignment;
class Country1 {
	String name;
	int population;
	String CountryType;
	int medianAge;
	Country1(String na, int po, String co, int me){
		name = na;
		population = po;
		medianAge = me;
		CountryType = co;
		System.out.println("---------Country details----------");
		System.out.println("name: "+name);
		System.out.println("type: "+CountryType);
		System.out.println("population: "+population);
		System.out.println("median age: "+medianAge);
		System.out.println();
	}
}

class State1 {
	String name;
	int stateId;
	String status;
	int population;
	State1(String na, int sId, String st, int po) {
		name = na;
		stateId = sId;
		status = st;
		population = po;
		System.out.println("---------State details----------");
		System.out.println("Name: "+name);
		System.out.println("st Id: "+stateId);
		System.out.println("status: "+status);
		System.out.println("population: "+population);
		System.out.println();
	}
}

class District1 {
	String name;
	String districtType;
	int districtId;
	int population;
	District1(String na, String di, int diId, int po) {
		name = na;
		districtType = di;
		districtId = diId;
		population = po;
		System.out.println("---------District details----------");
		System.out.println("name: "+name);
		System.out.println("type: "+districtType);
		System.out.println("district d: "+districtId);
		System.out.println("population: "+population);
		System.out.println();
	}
}

class Village1 {
	String name;
	String type;
	int villageId;
	int population;
	Village1(String na, String ty, int vId, int po) {
	type = ty;
	name = na;
	villageId = vId;
	population = po;
	System.out.println("--------------vils details-----------");
	System.out.println("Type: "+type);
	System.out.println("name: "+name);
	System.out.println("village Id: "+villageId);
	System.out.println("village population: "+population);
	System.out.println();
	}
}

public class Assignment3CountryParameterizedConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country1 coun = new Country1("India", 10000000, "Democracy", 26);
		
		State1 st = new State1("Karnataka", 111, "fully Integrated", 2000);
		
		District1 dis = new District1("Bangalore", "self governing", 2, 15000);
		
		Village1 vil = new Village1("VijayNager","Zilla",10,1000);
		

	}

}
