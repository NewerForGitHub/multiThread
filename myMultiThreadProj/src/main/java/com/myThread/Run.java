package com.myThread;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread thread = new Thread(c);
		thread.setName("A");//�޸ĵ���thread�Ľ�����������c��
//		c.setName("B");
		thread.start();//��������thread�̵߳���c���߳�
	}
	
}
