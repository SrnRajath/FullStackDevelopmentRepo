package com.gentech.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImplementation {

	static TreeSet obj = new TreeSet();
	static <E> void addElements() {
		System.out.println("Elements: "+obj);
		obj.add((E) "Mango");
		obj.add((E)"Orange");
		obj.add((E) "Apple");
		obj.add((E) "Grapes");
		obj.add((E) "Mango");
		obj.add((E)"Orange");
		obj.add((E) "Apple");
		obj.add((E) "Grapes");
	}
	
	static <E> void removeElement(String ele) {
		boolean t =obj.remove(ele);
		if(t==true) {
			System.out.println("Element removed");
		}
	}
	
	static void showAllElements() {
		obj.forEach(v1->System.out.println(v1));
	}
	
	static void convertToArray() {
		Object arr[] = obj.toArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addElements();
		showAllElements();
		removeElement("Grapes");
		showAllElements();
	}

}
