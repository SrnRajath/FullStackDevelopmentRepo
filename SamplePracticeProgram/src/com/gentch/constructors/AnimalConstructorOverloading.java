package com.gentch.constructors;

class Animal {
	Animal() {
		System.out.println("No value sent");
	}
	Animal(String name) {
		System.out.println("Animal Name: "+name);
	}
}

public class AnimalConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1= new Animal();
		Animal a2 = new Animal("Tiger");

	}

}
