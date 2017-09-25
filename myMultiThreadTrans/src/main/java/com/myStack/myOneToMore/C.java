package com.myStack.myOneToMore;

public class C {

	private MyStack stack;
	
	public C(MyStack stack) {
		this.stack = stack;
	}
	
	public void popService() {
		System.out.println("pop=" + stack.pop());
	}
}
