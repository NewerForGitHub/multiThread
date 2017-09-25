package com.myStack.myOneToMore;

public class Run {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		P p = new P(stack);
		C c1 = new C(stack);
		C c2 = new C(stack);
		C c3 = new C(stack);
		C c4 = new C(stack);
		C c5 = new C(stack);
		P_Thread tp = new P_Thread(p);
		C_Thread tc1 = new C_Thread(c1);
		C_Thread tc2 = new C_Thread(c2);
		C_Thread tc3 = new C_Thread(c3);
		C_Thread tc4 = new C_Thread(c4);
		C_Thread tc5 = new C_Thread(c5);
		tp.start();
		tc1.start();
		tc2.start();
		tc3.start();
		tc4.start();
		tc5.start();
	}
	
}
