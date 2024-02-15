package com.gentech.generics;
class MyGenericElement {
	public static<E> void readElement(E[] elements) {
		for(E element: elements) {
			System.out.println(element);
		}
	}
	
	public <E> void readElementObject(E[] elements) {
		for(E element: elements) {
			System.out.println(element);
		}
	}
}

public class GenericImplementationElementLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {10, 20, 30, 40, 50};
		MyGenericElement.readElement(arr);
		System.out.println("using objects");
		MyGenericElement gn = new MyGenericElement();
		gn.readElementObject(arr);
		Character[] ch= {'A', 'S', 'D', 'F', 'G'};
		MyGenericElement.readElement(ch);
		System.out.println("using objects");
		gn.readElementObject(ch);
		Double d[] = {1.1, 2.2, 3.3, 4.4, 5.5};
		MyGenericElement.readElement(d);
		System.out.println("using objects");
		gn.readElementObject(d);	
	}
}
