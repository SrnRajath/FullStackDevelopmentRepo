package com.gentech.classAssignment;
class Country {
	String name;
	int population;
	String CountryType;
	int medianAge;
}

class State {
	String name;
	int stateId;
	String status;
	int population;
}

class District {
	String name;
	String districtType;
	int districtId;
	int population;
}

class Village {
	String name;
	String type;
	int villageId;
	int population;
}

public class Assignment3Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country coun = new Country();
		coun.name = "India";
		coun.population = 1000000;
		coun.medianAge = 26;
		coun.CountryType = "Democracy";
		System.out.println("---------Country details----------");
		System.out.println("name: "+coun.name);
		System.out.println("type: "+coun.CountryType);
		System.out.println("population: "+coun.population);
		System.out.println("median age: "+coun.medianAge);
		System.out.println();
		State st = new State();
		st.name ="Karnataka";
		st.stateId = 111;
		st.status = "fully Integrated";
		st.population = 200000;
		System.out.println("---------State details----------");
		System.out.println("Name: "+st.name);
		System.out.println("st Id: "+st.stateId);
		System.out.println("status: "+st.status);
		System.out.println("population: "+st.population);
		System.out.println();
		District dis = new District();
		dis.name = "Bangalore";
		dis.districtType = "self governing";
		dis.districtId = 2;
		dis.population = 15000;
		System.out.println("---------District details----------");
		System.out.println("name: "+dis.name);
		System.out.println("type: "+dis.districtType);
		System.out.println("district d: "+dis.districtId);
		System.out.println("population: "+dis.population);
		System.out.println();
		Village vil = new Village();
		vil.type = "Zilla";
		vil.name = "VijayNager";
		vil.villageId = 10;
		vil.population = 1000;
		System.out.println("--------------vils details-----------");
		System.out.println("Type: "+vil.type);
		System.out.println("name: "+vil.name);
		System.out.println("village Id: "+vil.villageId);
		System.out.println("village population: "+vil.population);
		System.out.println();

	}

}
