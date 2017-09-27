package com.myStack.myMoreToMore;

public class Run {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		P p1 = new P(stack);
		P p2 = new P(stack);
		P p3 = new P(stack);
		P p4 = new P(stack);
		P p5 = new P(stack);		
		C c1 = new C(stack);
		C c2 = new C(stack);
		C c3 = new C(stack);
		C c4 = new C(stack);
		C c5 = new C(stack);
		P_Thread tp1 = new P_Thread(p1);
		P_Thread tp2 = new P_Thread(p2);
		P_Thread tp3 = new P_Thread(p3);
		P_Thread tp4 = new P_Thread(p4);
		P_Thread tp5 = new P_Thread(p5);
		C_Thread tc1 = new C_Thread(c1);
		C_Thread tc2 = new C_Thread(c2);
		C_Thread tc3 = new C_Thread(c3);
		C_Thread tc4 = new C_Thread(c4);
		C_Thread tc5 = new C_Thread(c5);
		tp1.start();
		tp2.start();
		tp3.start();
		tp4.start();
		tp5.start();
		tc1.start();
		tc2.start();
		tc3.start();
		tc4.start();
		tc5.start();
	}
	
}
