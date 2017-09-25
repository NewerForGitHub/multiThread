package com.myWaitAndNotify.ab;

import com.mySleepAndWhile.MyList;

public class ThreadA extends Thread {

	private MyList list;
	
	public ThreadA(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			synchronized (list) {
				for(int i=0; i<10; i++) {
					list.add();
					System.out.println("�����" + (i+1) + "��Ԫ��");
					if(list.size() == 5) {
						list.notify();
						System.out.println("����֪ͨ");
					}
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
