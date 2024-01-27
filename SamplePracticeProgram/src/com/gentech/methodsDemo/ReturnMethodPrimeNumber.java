package com.gentech.methodsDemo;
class MethodPrimeNumber {
	boolean isPrime(int number) {
		int flag=0;
		for(int i=2; i<number; i++) {
			if(number%i==0 || i==1) {
				flag++;
				break;
			}
		}
		return (flag==0)?true:false;
	}
}

public class ReturnMethodPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodPrimeNumber pm= new MethodPrimeNumber();
		System.out.println("++++++++++Prime number between 1 to 50+++++++++++");
		for(int i=1; i<=50; i++) {
			if(pm.isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int count=0;
		System.out.println("++++++++++count Prime number between 1 to 100+++++++++++");
		for(int i=1; i<=100; i++) {
			if(pm.isPrime(i)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
