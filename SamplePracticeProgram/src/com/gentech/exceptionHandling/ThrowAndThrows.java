package com.gentech.exceptionHandling;
class VerifyString {
	static int getCharacterCount(String str) throws Exception{
		if(str==null) {
			//below is nothing but user defined exception
			throw new Exception("Please prove valid string ");
		}
		return str.length();
	}
}
public class ThrowAndThrows {

	public static void main(String[] args) {
		try {
			int v1 = VerifyString.getCharacterCount(null);
			System.out.println("length of characters: "+v1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
