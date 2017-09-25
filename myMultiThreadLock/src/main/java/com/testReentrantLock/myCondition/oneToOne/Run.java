package com.testReentrantLock.myCondition.oneToOne;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
        Thread.sleep(2000);
        service.signalA();
    }
}
