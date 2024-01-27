package com.gentch.constructors;

class Birds1 {
	Birds1(String featherColor) {
		this("Sparrow", 5);
		System.out.println("color of Birds: "+featherColor);
	}
	Birds1(String name, int lifeSpan) {
		System.out.println("Bird Name: "+name);
		System.out.println("Life span: "+lifeSpan);
	}
}

public class ConstructorChaininigDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds1 b = new Birds1("Blue");

	}

}
