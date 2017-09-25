package com.mySingleton;

public class Run {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					MySingleton instance = MySingleton.getInstance();
					System.out.println(instance);
				}
			}).start();
		}
	}
	
}
