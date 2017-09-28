package com.threadGroup.add;

public class ThreadA extends Thread {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out
                .println("ThreadName:" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
