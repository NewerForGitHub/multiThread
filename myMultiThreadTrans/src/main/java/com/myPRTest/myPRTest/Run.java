package com.myPRTest.myPRTest;

public class Run {
	//�����������ߣ�һ��һ
	public static void main(String[] args) {
		Object lock = new Object();
		P p = new P(lock);
		C c = new C(lock);
		ThreadP pt = new ThreadP(p);
		pt.start();
		ThreadC ct = new ThreadC(c);
		ct.start();
	}
}
