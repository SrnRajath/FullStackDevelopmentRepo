package com.gentch.constructors;

class Human {
	String fullName;
	int age;
	Human() {
		fullName = "Sachin Tendulkar";
		age = 57;
		System.out.println("full Name: "+fullName);
		System.out.println("Age: "+age);
		System.out.println("-------------Human Info printed------------------");
	}
}

class Product {
	String productName;
	double productPrice;
	Product() {
		productName = "Lenovo laptop";
		productPrice = 55000.44;
		System.out.println("Product Name: "+productName);
		System.out.println("product price: "+productPrice);
		System.out.println("------------Product info Printed-------------------");
	}
}

class Birds {
	String featherColor;
	int noOfWings;
	Birds() {
		featherColor= "Gray Color";
		noOfWings = 2;
		System.out.println("feather color: "+featherColor);
		System.out.println("no Of Wings: "+noOfWings);
		System.out.println("-------------Birds Info printed-------------------");
	}
}

class DomesticAnimals {
	String quantityOfMilkProvided;
	String breedName;
	DomesticAnimals() {
		quantityOfMilkProvided = "10 lts";
		breedName = "Sindhi";
		System.out.println("quantity of milk provided: "+quantityOfMilkProvided);
		System.out.println("Breed name: "+breedName);
		System.out.println("-------------Domestic Animals info printed-------------------");
	}
}

public class NoArgsConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human sachin = new Human();
		Product lenovo = new Product();
		Birds sparrow = new Birds();
		DomesticAnimals cow = new DomesticAnimals();

	}

}
