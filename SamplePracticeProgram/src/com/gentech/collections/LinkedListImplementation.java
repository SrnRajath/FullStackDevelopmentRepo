package com.gentech.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListImplementation {
	static<E> void readingElements(LinkedList<E> obj) {
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
		LinkedList obj = new LinkedList();
		System.out.println("elements: "+obj);
		obj.add(true);
		obj.add(450);
		obj.add(12.99);
		obj.add('W');
		obj.add("Mango");
		System.out.println("Elements: "+obj);
	}
	
	static void readUsingListIterator() {
		LinkedList obj = new LinkedList();
		System.out.println("elements: "+obj);
		obj.add(true);
		obj.add(450);
		obj.add(12.99);
		obj.add('W');
		obj.add("Mango");
		System.out.println("Elements: "+obj);
		ListIterator listElements = obj.listIterator();
		while(listElements.hasNext()) {
			System.out.println(listElements.next());
		}
		System.out.println("Reading in reverse order");
		while(listElements.hasPrevious()) {
			System.out.println(listElements.previous());
		}
	}
	
	static void listAsQueue() {
		Queue obj = new LinkedList();
		System.out.println("elements: "+obj);
		obj.add(true);
		obj.add(450);
		obj.add(12.99);
		obj.add('W');
		obj.add("Mango");
		System.out.println("Elements: "+obj);
		obj.remove();
		System.out.println("Elements: "+obj);
		obj.remove();
		System.out.println("Elements: "+obj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj = new LinkedList<String>();
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
//		for(String s: obj) {
//			System.out.println("removing elements one by one: "+s);
//			obj.remove(s);
//		}
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
		listAsQueue();

	}

}
