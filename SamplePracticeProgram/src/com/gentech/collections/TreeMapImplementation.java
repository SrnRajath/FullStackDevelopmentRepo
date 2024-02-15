package com.gentech.collections;

import java.util.TreeMap;

public class TreeMapImplementation {
	static TreeMap<String, String> obj = new TreeMap<String, String>();
	static void addElements() {
		obj.put("Camel", "Ship of desert");
		obj.put("Mango", "King of fruit");
		obj.put("Lotus", "National flower");
		obj.put("Tiger", "National animal");
		obj.put("Peacock", "National Bird");
		obj.put("Lion", "King of Jungle");
		//obj.put(null, "Support Null value");
		obj.put("null", "no Support for Null value passed string null");
		System.out.println("elements: "+obj);
	}
	
	static void readAndRemoveElements(String key) {
		System.out.println("Removing Key entry: "+ key +": "+obj.get(key));
		obj.remove(key);
		System.out.println("elements: "+obj);
	};
	
	static void readElements() {
		obj.forEach((k, v) -> System.out.println(k+" --> "+v));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addElements();
		readAndRemoveElements("null");
		readElements();
	}

}
