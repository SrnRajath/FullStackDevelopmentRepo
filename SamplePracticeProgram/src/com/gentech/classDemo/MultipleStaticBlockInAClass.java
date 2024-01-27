package com.gentech.classDemo;
class MultipleStatic {
	static {
		System.out.println("Exectuion start here as it is sequential");
	}
	static {
		System.out.println("This executes second");
	}
	static {
		System.out.println("This executes last as static blocks"
				+ " are executed sequentially");
	}
}

public class MultipleStaticBlockInAClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleStatic ms = new MultipleStatic();

	}

}
