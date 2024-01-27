package com.gentech.methodsDemo;
class Digits{
	void getDigits(int num) {
		if(num>=0 && num<10) {
			System.out.println("Single digit");
		} else if(num>=10 && num<100) {
			System.out.println("2 digits");
		} else if(num>=100 && num<1000) {
			System.out.println("3 digits");
		} else if(num>=1000 && num<10000) {
			System.out.println("4 digits");
		} else if(num>=10000 && num<100000) {
			System.out.println("5 digits");
		} else if(num>=10000 && num<1000000) {
			System.out.println("6 digits");
		}
	}
}
public class MethodDisplayNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digits digit = new Digits();
		digit.getDigits(5000);

	}

}
