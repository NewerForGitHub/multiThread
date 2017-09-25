package com.myStack.myOneToOne;

public class Run {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		P p = new P(stack);
		C c = new C(stack);
		ThreadP tp = new ThreadP(p);
		ThreadC tc = new ThreadC(c);
		tp.start();
		tc.start();
	}
	
}
