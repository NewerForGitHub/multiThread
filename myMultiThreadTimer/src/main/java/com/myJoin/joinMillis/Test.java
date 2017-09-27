package com.myJoin.joinMillis;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        System.out.println("end :" + System.currentTimeMillis());
    }
}
