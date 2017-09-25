package com.testReentrantLock.myCondition.printALT.oneByOne;

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (true) {
            this.service.printA();
        }
    }

}
