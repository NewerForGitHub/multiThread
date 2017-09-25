package com.mySuspend;

/**
 * �÷�����ȱ�㣺<br>
 * 1.��ռ�������������߳��޷�����<br>
 * 2.���ݲ�ͬ�����е����������ݿ������������<br>
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.start();
		Thread.sleep(5000);
		
		//A��
		mt.suspend();
		System.out.println("A=" + System.currentTimeMillis() + " i=" + mt.getI());
		Thread.sleep(5000);
		System.out.println("A=" + System.currentTimeMillis() + " i=" + mt.getI());

		//B��
		mt.resume();
		Thread.sleep(5000);
		
		//C��
		mt.suspend();
		System.out.println("A=" + System.currentTimeMillis() + " i=" + mt.getI());
		Thread.sleep(5000);
		System.out.println("A=" + System.currentTimeMillis() + " i=" + mt.getI());
	}
}
