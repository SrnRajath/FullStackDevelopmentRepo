package com.gentech.inheritanceConcepts;
class Village {
	Village(double d) {
		System.out.println("Village Population: "+d);
	}
}
class Taluk extends Village {
	public Taluk(double population) {
		super(population*0.1);
		System.out.println("Taluk Population: "+population);
	}
}
class District extends Taluk {

	public District(double population) {
		super(population*0.1);
		System.out.println("District Population: "+population);
	}
}
class Block extends Village {

	Block(double d) {
		super(d*0.2);
		System.out.println("Block population: "+d);
	}
	
}

public class AssignmentHybridWithParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		District d = new District(10000);
		System.out.println("============Block Information==========");
		Block b = new Block(5000);

	}

}
