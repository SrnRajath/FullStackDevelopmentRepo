package com.gentech.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImplementation {
	
	static<E> void readingElements(ArrayList<E> obj) {
		for(int i=0; i<obj.size(); i++) {
			System.out.println(obj.get(i));
		}
		System.out.println("using iterator");
		Iterator<E> ite = obj.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	
	static void withOutGenerics() {
		ArrayList obj = new ArrayList();
		System.out.println("elements: "+obj);
		obj.add(true);
		obj.add(450);
		obj.add(12.99);
		obj.add('W');
		obj.add("Mango");
		System.out.println("Elements: "+obj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<String>();
		System.out.println("Elements: "+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add(1, "Pineapple");
		obj.add("Kiwi");
		obj.add("waterMelon");
		obj.add("Banana");
		System.out.println("Elements: "+obj);
		//for(String s: obj) {
		int k=0;
		for(int i=0; i<obj.size(); i++) {
			System.out.println("removing elements one by one: "+obj.get(k));
			obj.remove(obj.get(k));
			k=0;
		}
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add(1, "Pineapple");
		obj.add("Kiwi");
		obj.add("waterMelon");
		obj.add("Banana");
		
		readingElements(obj);
		withOutGenerics();
		
	}
}
