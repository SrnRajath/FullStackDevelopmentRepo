package com.gentech.arrays;

public class DoubleArrayReadWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] d = new double[5];
		int i=0;
		double count = 1.0;
		while(i<d.length) {
			d[i] =count;
			count++;
			i++;
		}
		int j=0;
		while(j<d.length) {
			System.out.println(d[j]);
			j++;
		}
	}

}
