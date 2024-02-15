package com.gentech.generics;
class MyGenericClass<T> {
	T obj = null;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}

public class GenericImplementationClassLevel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using Generics
		MyGenericClass<Integer> o1 = new MyGenericClass<Integer>();
		o1.add(140);
		int v1 = o1.get();
		System.out.println(v1);
		//without generics
		MyGenericClass o2 = new MyGenericClass();
		o2.add("Mango");
		String s1 = (String) o2.get();
		System.out.println(s1);
		o2.add('Y');
		char ch1 = (char) o2.get();
		System.out.println(ch1);
	}
}
