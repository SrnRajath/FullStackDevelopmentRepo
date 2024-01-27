package com.gentech.inheritanceConcepts;
class AA {
	AA() {
		System.out.println("its a AA constructor");
	}
}

class BB {
	BB() {
		//super() is called by default during runtime
		System.out.println("its a AA constructor");
	}
}

class CC {
	//super() is called by default during runtime
	CC() {
		System.out.println("its a AA constructor");
	}
}
public class MultilievelInheritanceNoOrgsConstructorExecutionOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC c = new CC();
	}
}
