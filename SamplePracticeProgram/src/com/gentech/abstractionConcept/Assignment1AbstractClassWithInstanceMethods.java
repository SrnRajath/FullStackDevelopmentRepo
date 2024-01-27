package com.gentech.abstractionConcept;

abstract class University {
	int res;
	int fee(int UniversityFee) {
		res += UniversityFee+100;
		System.out.println("University fee after adding library fee: "+res);
		return res;
	}
	int HostelFee(int fee) {
		res += fee;
		System.out.println("University fee after adding hostel fee: "+res);
		return res;
	}
	
}
class SJCE extends University {
	
}
public class Assignment1AbstractClassWithInstanceMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University uni = new SJCE();
		uni.fee(10000);
		uni.HostelFee(5000);
	}

}
