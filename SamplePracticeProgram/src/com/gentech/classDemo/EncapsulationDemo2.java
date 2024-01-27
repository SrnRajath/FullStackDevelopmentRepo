package com.gentech.classDemo;

class Human1 {
	String fullName;
	int age;
}

class Product {
	String productName;
	double productPrice;
}

class Birds {
	String featherColor;
	int noOfWings;
}

class DomesticAnimals {
	String quantityOfMilkProvided;
	String breedName;
}

public class EncapsulationDemo2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human1 sachin = new Human1();
		sachin.fullName = "Sachin Tendulkar";
		sachin.age = 57;
		System.out.println("full Name: "+sachin.fullName);
		System.out.println("Age: "+sachin.age);
		System.out.println("----------------------------");
		Product lenovo = new Product();
		lenovo.productName = "Lenovo laptop";
		lenovo.productPrice = 55000.44;
		System.out.println("Product Name: "+lenovo.productName);
		System.out.println("product price: "+lenovo.productPrice);
		System.out.println("-------------------------------");
		Birds sparrow = new Birds();
		sparrow.featherColor= "Gray Color";
		sparrow.noOfWings = 2;
		System.out.println("feather color: "+sparrow.featherColor);
		System.out.println("no Of Wings: "+sparrow.noOfWings);
		System.out.println("--------------------------------");
		DomesticAnimals cow = new DomesticAnimals();
		cow.quantityOfMilkProvided = "10 lts";
		cow.breedName = "Sindhi";
		System.out.println("quantity of milk provided: "+cow.quantityOfMilkProvided);
		System.out.println("Breed name: "+cow.breedName);
		System.out.println("--------------------------------");
	}

}
