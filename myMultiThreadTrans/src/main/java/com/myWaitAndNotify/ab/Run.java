package com.myWaitAndNotify.ab;

import com.mySleepAndWhile.MyList;

public class Run {

	public static void main(String[] args) {
		MyList service = new MyList();
		ThreadB b = new ThreadB(service);
		b.setPriority(1);
		b.setName("B");
		b.start();
		ThreadB c = new ThreadB(service);
		c.setPriority(10);
		c.setName("C");
		c.start();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
	}
	
}
