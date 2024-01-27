package com.gentech.polymorphismConcepts;
abstract class GeometricFigure {
	abstract void area();
}

class Square extends GeometricFigure {
	@Override
	void area() {
		// TODO Auto-generated method stub
		int side = 5;
		System.out.println("Area of square: "+(side*side));
	}	
}

class Rectange extends GeometricFigure {

	@Override
	void area() {
		// TODO Auto-generated method stub
		int len = 5, breadth = 10;
		System.out.println("Area of square: "+(len*breadth));
	}	
}

class Circle extends GeometricFigure {

	@Override
	void area() {
		// TODO Auto-generated method stub
		double pi=3.14, radius=3.5;
		System.out.println("Area of Circle: "+(pi*radius*radius));
	}
	
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Rectange r = new Rectange();
		Square s = new Square();
		
		GeometricFigure g = null;
		g=c;
		g.area();
		g=r;
		g.area();
		g=s;
		g.area();
	}
}
