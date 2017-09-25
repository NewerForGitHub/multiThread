package com.myYield;

/**
 * Thread.yield()��ʾ��ͣ�̣߳�������ǰCPU��Դ<br>
 * <b>���Ƿ�����ʱ�䲻ȷ�������ܸոշ������ֻ����̻�ȡCPUʱ��Ƭ</b>
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		int count = 0;
		for(int i=0; i<5000000; i++) {
//			Thread.yield();
			count += i +1;
		}
		System.out.println("count = " + count);
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��" + (end - start) + "ms");
	}

}
