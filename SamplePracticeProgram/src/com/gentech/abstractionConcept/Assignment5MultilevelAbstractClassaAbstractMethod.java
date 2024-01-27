package com.gentech.abstractionConcept;
abstract class abs {
	abstract void displaySpeed(int distance, int time);
	abstract void displayAccelaration(int distance, int time);
}

abstract class speed extends abs {
	
	@Override
	void displaySpeed(int distance, int time) {
		float speed = distance/time;
		System.out.println("The speed of vehicle is: "+speed);
	}
}
class accelaration extends speed {

	@Override
	void displayAccelaration(int distance, int time) {
		float accelaration = distance/(time*time);
		System.out.println("The accelaration of vehicle is: "+accelaration);
		
	}
	
}
public class Assignment5MultilevelAbstractClassaAbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abs a = new accelaration();
		a.displaySpeed(10, 2);
		a.displayAccelaration(10, 2);
	}

}
