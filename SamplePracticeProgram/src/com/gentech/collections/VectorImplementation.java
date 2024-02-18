package com.gentech.collections;

import java.util.Collections;
import java.util.Vector;

public class VectorImplementation<E> {
	Vector<E> vec = new Vector<E>();
	void addElements(E[] ele) {
		try {
			Collections.addAll(vec,ele);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void displayElements() {
		System.out.println("************Elements in vector************");
		vec.forEach(ele -> System.out.println(ele));
	}
	
	void removeElement(E element) {
		vec.remove(element);
		System.out.println("-----------Elements after removing a element---------");
		vec.forEach(ele -> System.out.println(ele));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1, 2, 3, 4, 5, 6, 7};
		VectorImplementation<Integer> vec = new VectorImplementation<Integer>();
		vec.addElements(a);
		vec.displayElements();
		vec.removeElement(7);
	}
}
