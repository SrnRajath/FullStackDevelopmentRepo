package com.gentech.programs;

public class DisplayNumberOfDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=1;
			if (num<10) {
				System.out.println(1);
			}else if (num>=10 && num<100) {
				System.out.println(2);
			}else if (num>=100 && num<1000) {
				System.out.println(3);
			}
			else if (num>=1000 && num<10000) {
				System.out.println(4);
			}
			else if (num>=10000 && num<100000) {
				System.out.println(5);
			}
			else if (num>=100000 && num<1000000) {
				System.out.println(6);
			}
			else if (num>=1000000 && num<10000000) {
				System.out.println(7);
			}
			else if (num>=10000000 && num<100000000) {
				System.out.println(8);
			}
	}

}
