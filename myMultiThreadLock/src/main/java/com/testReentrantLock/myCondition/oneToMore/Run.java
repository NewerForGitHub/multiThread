package com.testReentrantLock.myCondition.oneToMore;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(2000);
        service.signal();
    }
}
