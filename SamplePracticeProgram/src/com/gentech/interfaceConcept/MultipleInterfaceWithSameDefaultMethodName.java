package com.gentech.interfaceConcept;
interface User {
	default void showName(String name) {
		System.out.println("User name: "+name);
	}
}

interface UserProfile {
	default void showName(String name) {
		System.out.println("User profile name: "+name);
	}
}

class Admin implements User, UserProfile {

	@Override
	public void showName(String name) {
		// TODO Auto-generated method stub
		UserProfile.super.showName(name);
	}
	
}

public class MultipleInterfaceWithSameDefaultMethodName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
