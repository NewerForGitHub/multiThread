package com.testReentrantReadWriteLock.writeAndWrite;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.write();
    }

}
