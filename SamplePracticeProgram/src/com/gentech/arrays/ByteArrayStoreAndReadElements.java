package com.gentech.arrays;

public class ByteArrayStoreAndReadElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] a = new byte[5];
		for(int i=0; i<a.length; i++) {
			a[i] = (byte)i;
		}
		for(byte b: a) {
			System.out.println(b);
		}
	}

}
