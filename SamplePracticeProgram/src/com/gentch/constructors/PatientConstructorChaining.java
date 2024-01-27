package com.gentch.constructors;

class Patient {
	Patient(int age) {
		this("M");
		System.out.println("age: "+age);
	} 
	Patient(String gender) {
		System.out.println("Gender: "+gender);
	}
}

public class PatientConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient(10);
		Patient p2 = new Patient("F");
	}

}
