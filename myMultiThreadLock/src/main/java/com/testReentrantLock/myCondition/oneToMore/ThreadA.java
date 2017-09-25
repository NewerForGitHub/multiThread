package com.testReentrantLock.myCondition.oneToMore;

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.await();
    }

}
