package com.myStack.myOneToOne;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

	private List<String> list = new ArrayList<String>();
	
	public synchronized void push() {
		try {
			if(list.size() == 1) {
				System.out.println("push������" + Thread.currentThread().getName() + " �̳߳�wait״̬");
				this.wait();
			}
			list.add("�����=" + Math.random());
			this.notify();
			System.out.println("push=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized String pop() {
		String value = "";
		try {
			if(list.size() == 0) {
				System.out.println("pop������" + Thread.currentThread().getName() + " �̳߳�wait״̬");
				this.wait();
			}
			value = list.get(0);
			list.remove(0);
			this.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return value;
	}
	
}
