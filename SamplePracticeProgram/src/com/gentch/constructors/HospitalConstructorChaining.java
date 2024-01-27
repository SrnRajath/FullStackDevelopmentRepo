package com.gentch.constructors;
class Hospital {
	Hospital(String name) {
		System.out.println("Name: "+name);
	}
	Hospital(String address, String name) {
		this(name);
		System.out.println("Address: "+address);
	}
}

public class HospitalConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h1 = new Hospital("near Secure Hospital stop", "Seetharanga");
	}

}
