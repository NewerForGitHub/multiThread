package com.testReentrantReadWriteLock.readAndRead;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.read();
    }

}
