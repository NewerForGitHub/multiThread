package com.testReentrantReadWriteLock.writeAndWrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write() {
        try {
            this.lock.writeLock().lock();
            System.out.println("获取写锁" + Thread.currentThread().getName() + " "
                + System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.lock.writeLock().unlock();
            System.out.println("解开写锁" + Thread.currentThread().getName() + " "
                + System.currentTimeMillis());
        }
    }

}
