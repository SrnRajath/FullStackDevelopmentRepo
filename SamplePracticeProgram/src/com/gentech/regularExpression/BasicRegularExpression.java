package com.gentech.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegularExpression {
	
	static void exactMatch() {
		Pattern pattern = Pattern.compile("hello");
		Matcher matcher = pattern.matcher("hello");
		boolean val = matcher.matches();
		System.out.println("checking exact match it is: "+val);
	}
	
	static void contains() {
		Pattern pattern = Pattern.compile("hello");
		Matcher matcher = pattern.matcher("welcome hello sayhello hi greeting");
		boolean val = matcher.find();
		System.out.println("Contains implementation using regex: "+val);
	}
	
	static void findCount() {
		Pattern pattern = Pattern.compile("hello");
		Matcher matcher = pattern.matcher("welcome hello sayhello hi greeting");
		int count=0;
		while(matcher.find()) {
			count++;
		}
		System.out.println("number of occurance: "+count);
	}
	
	static void splitString() {
		Pattern pattern = Pattern.compile("[!@#$%]");
		String str = "Mango!pine@wow#Great$fun%";
		String s[] = pattern.split(str);
		for(String kk: s) {
			System.out.println(kk);
		}
	}
	
	static void displayMatch() {
		Pattern pattern = Pattern.compile("hello");
		Matcher matcher = pattern.matcher("welcome hello sayhello hi greeting");
		System.out.println("Displaying matches");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
	static void matchingPosition() {
		Pattern pattern = Pattern.compile("hello");
		Matcher matcher = pattern.matcher("welcome hello sayhello hi greeting");
		System.out.println("///////////displaying position of match///////////");
		while(matcher.find()) {
			System.out.println(matcher.start()+" "+matcher.end());
		}
	}
	
	static void replaceMatch() {
		Pattern pattern = Pattern.compile("hello");
		Matcher matcher = pattern.matcher("welcome hello sayhello hi greeting");
		String s = matcher.replaceAll("Raj");
		System.out.println(".......After Replacing........");
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exactMatch();
		splitString();
		contains();
		findCount();
		displayMatch();
		matchingPosition();
		replaceMatch();
	}

}
