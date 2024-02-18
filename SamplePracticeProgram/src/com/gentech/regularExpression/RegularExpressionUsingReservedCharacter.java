package com.gentech.regularExpression;

import java.math.MathContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionUsingReservedCharacter {
	static void regExpressionCheck3Digits() {
		Pattern pattern = Pattern.compile("[0-9]{3}");
		String str = "Kolar has received 112 mm of rain";
		Matcher matcher = pattern.matcher(str);
		String val = matcher.replaceAll("main");
		System.out.println(val);
	}
	
	static void usingGroup() {
		Pattern pattern = Pattern.compile("[a-z A-Z]+");
		String str = "the temple1 is at the top of the hill";
		Matcher match = pattern.matcher(str);
		while(match.find()) {
			System.out.println(match.group());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		regExpressionCheck3Digits();
		usingGroup();
	}

}
