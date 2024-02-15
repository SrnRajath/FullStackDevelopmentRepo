package com.gentech.collections;

import java.util.HashMap;

public class HashMapImplementation {
	static HashMap<String, String> obj = new HashMap<String, String>();
	static void addElements() {
		obj.put("Camel", "Ship of desert");
		obj.put("mango", "King of fruit");
		obj.put("lotus", "National flower");
		obj.put("Tiger", "National animal");
		obj.put("Peacock", "National Bird");
		obj.put("Lion", "King of Jungle");
		obj.put(null, "Support Null value");
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
		readAndRemoveElements(null);
		readElements();
	}

}
