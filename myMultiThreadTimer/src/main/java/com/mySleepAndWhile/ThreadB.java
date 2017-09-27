package com.mySleepAndWhile;

public class ThreadB extends Thread {

	private MyList list;
	
	public ThreadB(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				if(list.size() == 5) {
					System.out.println("==5�ˣ��߳�B�˳�");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
