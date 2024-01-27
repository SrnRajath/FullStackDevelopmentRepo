package com.gentech.classDemo;
class Outer1 {
	String firstName;
	Inner1 in = new Inner1();
	void showCityName() {
		in.cityName="Bangalore";
		System.out.println("City Name of student: "+in.cityName);
	}
	void showPincode() {
		in.pinCode=560021;
		System.out.println("Pincode of the city: "+in.pinCode);
	}
	
	static class Inner1 {
		String cityName;
		int pinCode;
		void showFn()
		{
			Outer1 o = new Outer1();
			o.firstName="Santosh";
			System.out.println("First name of Student: "+o.firstName);
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 outer = new Outer1();
		outer.showCityName();
		outer.showPincode();
		outer.in.showFn();
	}
}
