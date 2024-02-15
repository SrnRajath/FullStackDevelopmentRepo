package com.gentech.collections;
import java.util.Stack;
public class StackImplementation {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<E> st = new Stack<E>();
		pushDemo(st, 100);
		pushDemo(st, 200);
		pushDemo(st, 300);
		popDemo(st);
		
	}
	
	static <E> void pushDemo(Stack st, int i) {
		st.push(i);
		System.out.println("Added Element: "+i);
	}
	
	static void popDemo(Stack st) {
		int v1= (int)st.pop();
		System.out.println("Removed Element: "+v1);
	}
}
