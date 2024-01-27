package com.gentech.methodsDemo;
class Sort {
	void getSorted(int[] a) {
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}

public class SortArray {

	public static void main(String[] args) {
		int[] a = {10, 7, 1, 5, 2, 9, 8, 3, 4, 6};
		Sort s = new Sort();
		s.getSorted(a);

	}

}
