package com.gentech.methodsDemo;
class Table {
	void printTable(int n) {
		System.out.println("==========Printing"+n+" tables==========");
		for(int i=1; i<=10; i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}
}

public class GenerateTableUsingMethod {

	public static void main(String[] args) {
		Table t1 = new Table();
		t1.printTable(5);
		t1.printTable(6);
	}

}
