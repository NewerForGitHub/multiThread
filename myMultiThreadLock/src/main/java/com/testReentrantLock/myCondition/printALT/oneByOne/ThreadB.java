package com.testReentrantLock.myCondition.printALT.oneByOne;

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (true) {
            this.service.printB();
        }
    }

}
