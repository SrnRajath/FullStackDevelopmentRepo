package com.gentch.constructors;
class SoftwareTools {
	int price;
	String tool;
	SoftwareTools() {
		price = 50000;
		tool = "UFT";
		System.out.println("Default values price: "+price+" tool name: "+tool);
	}
	SoftwareTools(int price, String tool) {
		this.price = price;
		this.tool = tool;
		System.out.println("Assigned values price: "+this.price+" tool name: "+this.tool);
	}
}

public class SoftwareToolsConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwareTools s1 = new SoftwareTools();
		SoftwareTools s2 = new SoftwareTools(8000, "Adobe photoshop");
	}

}
