package com.gentech.strings;

public class StringOperations {

	static void lowerCase() {
		String s1 = "Welcome";
		String s2 = s1.toLowerCase();
		System.out.println("lower case: "+s2);
		System.out.println("+++++++++++++++");
	}
	
	static void upperCase() {
		String s1 = "Welcome";
		String s2 = s1.toUpperCase();
		System.out.println("Upper case: "+s2);
		System.out.println("+++++++++++++++");
	}
	
	static void displayNumberOfCharacters() {
		String s1 = "Welcome";
		System.out.println("# of chars: "+s1.length());
		System.out.println("+++++++++++++++");
	}
	
	static void verifyStringEmpty() {
		String s1 = "";
		String s2 = new String();
		String s3 = " ";
		System.out.println("is s1 empty: "+s1.isEmpty());
		System.out.println("is s2 empty: "+s2.isEmpty());
		System.out.println("is s3 blank: "+s1.isBlank());
		System.out.println("is s3 empty: "+s1.isEmpty());
		System.out.println("+++++++++++++++");
	}
	
	static void replace() {
		String s1 = "It is a new place";
		System.out.println("Replace result: "+s1.replace("is", "was"));
		System.out.println("+++++++++++++++");
	}
	
	static void compareStrings() {
		String s1 = "Welcome";
		String s2 = new String("Welcome");
		String s3 = "WELCOME";
		String s4 = "welcome";
		System.out.println("s1==s2 => "+(s1==s2));
		System.out.println("s1.equals(s2) => "+(s1.equals(s2)));
		System.out.println("s1.equals(s3) => "+(s1.equals(s3)));
		System.out.println("s1.equalsIngnoreCase(s3) => "+(s1.equalsIgnoreCase(s3)));
		System.out.println("s3.compareTo(s4) => "+(s3.compareTo(s4)));
		System.out.println("s3.compareToIgnoreCase(s4) => "+(s3.compareToIgnoreCase(s4)));
		System.out.println("+++++++++++++++");
	}
	
	static void characterAtPosition() {
		String s1 = "PROGRAM";
		System.out.println("Character ar position 3"+s1.charAt(2));
		System.out.println("+++++++++++++++");
	}
	
	static void stringExistance() {
		String s1 = new String("Bangalore is Capital city of Karnataka");
		System.out.println("s1.startsWith('Ban') => "+s1.startsWith("Ban"));
		System.out.println("s1.endsWith('ity') => "+s1.endsWith("ity"));
		System.out.println("s1.contains('ata') => "+s1.contains("ata"));
		System.out.println("+++++++++++++++");
	}
	
	static void extractString() {
		String s1 = "Programming";
		System.out.println("Based on position: "+s1.substring(3));
		System.out.println("Based on range: "+s1.substring(3, 7));
		System.out.println("+++++++++++++++");
	}
	
	static void splitString() {
		String s1 = "Orange, Apple, Mango";
		String str[] = s1.split(", ");
		System.out.println("splitted string");
		for(String s: str) {
			System.out.println(s);
		}
		System.out.println("+++++++++++++++");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperations.lowerCase();
		StringOperations.upperCase();
		StringOperations.compareStrings();
		StringOperations.displayNumberOfCharacters();
		StringOperations.extractString();
		StringOperations.splitString();
	}

}
