package com.myWaitAndNotify.ab;

import com.mySleepAndWhile.MyList;

public class ThreadB extends Thread {

	private MyList list;
	
	public ThreadB(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			synchronized (list) {
				if(list.size() != 5) {
					System.out.println(Thread.currentThread().getName() + "==�߳�A��ʼ�ȴ�");
					list.wait();
					System.out.println(Thread.currentThread().getName() + "==�߳�A�ȴ�����");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
