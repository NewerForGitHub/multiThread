package com.testReentrantLock.myReentrantLock;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        for (int i = 0; i < 5; i++) {
            MyThread t = new MyThread(service);
            t.start();
        }
    }
}
