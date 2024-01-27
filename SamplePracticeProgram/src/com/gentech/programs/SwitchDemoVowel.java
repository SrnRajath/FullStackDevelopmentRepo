package com.gentech.programs;

public class SwitchDemoVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'B';
		switch(ch) {
		case 'A': case 'a':
			System.out.println(ch+" is a vowel");
			break;
		case 'E': case 'e':
			System.out.println(ch+" is a vowel");
			break;
		case 'I': case 'i':
			System.out.println(ch+" is a vowel");
			break;
		case 'O': case 'o':
			System.out.println(ch+" is a vowel");
			break;
		case 'U': case 'u':
			System.out.println(ch+" is a vowel");
			break;
		default:
			System.out.println(ch+" is a not vowel");
		}

	}

}
