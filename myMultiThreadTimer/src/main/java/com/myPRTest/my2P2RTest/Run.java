package com.myPRTest.my2P2RTest;

public class Run {
	//�����������ߣ���Զ�
	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		P p = new P(lock);
		C c = new C(lock);
		
		ThreadP[] tp = new ThreadP[2];
		ThreadC[] tc = new ThreadC[2];
		for(int i=0; i<2; i++) {
			tp[i] = new ThreadP(p);
			tp[i].setName("P" + i);
			tc[i] = new ThreadC(c);
			tc[i].setName("C" + i);
			tp[i].start();
			tc[i].start();
		}
		while(true) {
			Thread.sleep(2000);
			
			Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
			Thread.currentThread().getThreadGroup().enumerate(threadArray);
			for(int i=0; i<threadArray.length; i++) {
				System.out.println(threadArray[i].getName() + " " +threadArray[i].getState());
			}
		}
	}
}
