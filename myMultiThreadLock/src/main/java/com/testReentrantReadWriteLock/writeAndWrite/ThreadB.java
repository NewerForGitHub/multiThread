package com.testReentrantReadWriteLock.writeAndWrite;

public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.write();
    }

}
