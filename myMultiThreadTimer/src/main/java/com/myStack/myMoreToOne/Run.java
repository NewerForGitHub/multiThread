package com.myStack.myMoreToOne;

public class Run {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		P p1 = new P(stack);
		P p2 = new P(stack);
		P p3 = new P(stack);
		P p4 = new P(stack);
		P p5 = new P(stack);
		C c = new C(stack);
		P_Thread tp1 = new P_Thread(p1);
		P_Thread tp2 = new P_Thread(p2);
		P_Thread tp3 = new P_Thread(p3);
		P_Thread tp4 = new P_Thread(p4);
		P_Thread tp5 = new P_Thread(p5);
		C_Thread tc = new C_Thread(c);
		tp1.start();
		tp2.start();
		tp3.start();
		tp4.start();
		tp5.start();
		tc.start();
	}
	
}
