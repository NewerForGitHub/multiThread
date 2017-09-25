package com.testReentrantLock.myCondition.oneToOne;

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.awaitB();
    }

}
