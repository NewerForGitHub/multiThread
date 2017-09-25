package com.myJoin.exception;

public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("B线程在run end处打印了");
        } catch (InterruptedException e) {
            System.out.println("B线程在catch处打印了");
            e.printStackTrace();
        }
    }

}
