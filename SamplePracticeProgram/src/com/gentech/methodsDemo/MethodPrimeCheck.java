package com.gentech.methodsDemo;
class Prime {
	void checkPrimeNumber(int n) {
		boolean check=false;
		for(int i=2; i<=Math.sqrt(n)+1; i++) {
			if(n%i==0 || n==1 || n==0) {
				System.out.println(n+" is Not Prime");
				check=true;
				break;
			}
		}
		if(!check) {
			System.out.println(n+" is Prime");
		}
	}
	void generatePrime(int start, int last) {
		if(start==1 || start==0) {
			start=2;
		}
		for(int i=start; i<=last; i++) {
			boolean check=false;
			for(int j=2; j<=Math.sqrt(i)+1; j++) {
				if(i%j==0 && i!=2) {
					check=true;
					break;
				}
			}
			if(!check) {
				System.out.println(i+" is Prime");
			}
		}
	}
	void countPrime(int start, int last) {
		System.out.println("===============================");
		int count=0;
		if(start==1 || start==0) {
			start=2;
		}
		for(int i=start; i<=last; i++) {
			boolean check=false;
			for(int j=2; j<=Math.sqrt(i)+1; j++) {
				if(i%j==0 && i!=2) {
					check=true;
					break;
				}
			}
			if(!check) {
				count++;
			}
		}
		System.out.println("Prime numbers between "+start+" and "+last+" is: "+count);
	}
	void getSumOfPrime(int start, int last) {
		System.out.println("=============Sum of prime between "+start+" and "+last+" is==================");
		int sum=0;
		if(start==1 || start==0) {
			start=2;
		}
		for(int i=start; i<=last; i++) {
			boolean check=false;
			for(int j=2; j<=Math.sqrt(i)+1; j++) {
				if(i%j==0 && i!=2) {
					check=true;
					break;
				}
			}
			if(!check) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
public class MethodPrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime p = new Prime();
//		p.checkPrimeNumber(5);
//		p.checkPrimeNumber(13);
//		p.checkPrimeNumber(4);
		p.generatePrime(1, 50);
		p.countPrime(50, 100);
		p.getSumOfPrime(1, 100);
	}

}
