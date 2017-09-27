package com.mySleepAndWhile;

public class ThreadA extends Thread {

	private MyList list;
	
	public ThreadA(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				list.add();
				System.out.println("�����" + (i+1) + "��Ԫ��");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
