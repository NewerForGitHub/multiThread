package com.myInterrupt;

/**
 * stop�����ᵼ�����ݲ�һ�µ����
 *
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(1000);
		t.interrupt();
		System.out.println("�Ƿ�ֹͣ1��" + t.isInterrupted());
		System.out.println("�Ƿ�ֹͣ2��" + t.isInterrupted());
	}

}
