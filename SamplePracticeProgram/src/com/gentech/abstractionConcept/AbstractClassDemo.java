package com.gentech.abstractionConcept;
abstract class College {
	abstract void showCollegeName(String name);
	abstract int numberOfCourse(int courses);
	void showBranches(String[] arr) {
		System.out.println("Courses Branches: ");
		for(String branch: arr) {
			System.out.print(branch+" ");
		}
	}
}
class KLECollege extends College {

	@Override
	void showCollegeName(String name) {
		// TODO Auto-generated method stub
		System.out.println("College Name: "+name);
	}

	@Override
	int numberOfCourse(int courses) {
		// TODO Auto-generated method stub
		return courses;
	}
	
	void showAddress(String address) {
		System.out.println("Address of college: "+address);
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		KLECollege kle = new KLECollege();
		College kle = new KLECollege();
		kle.showCollegeName("KLE Degree college");
		int v1 = kle.numberOfCourse(5);
		System.out.println("# of courses available: "+v1);
		String[] b = {"CS", "IS", "ME", "CIVIL", "E&E", "E&C"};
		kle.showBranches(b);
		//while using abstract reference showaddress method cannot be used
		//kle.showAddress("Mysore");
	}

}
