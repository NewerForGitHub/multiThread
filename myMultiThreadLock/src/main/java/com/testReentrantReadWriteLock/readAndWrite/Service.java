package com.testReentrantReadWriteLock.readAndWrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            this.lock.readLock().lock();
            System.out.println("获取读锁" + Thread.currentThread().getName() + " "
                + System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.lock.readLock().unlock();
            System.out.println("解开读锁" + Thread.currentThread().getName() + " "
                + System.currentTimeMillis());
        }
    }

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
