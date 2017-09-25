package com.testReentrantLock.myCondition.fairOrUnFair;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    public ReentrantLock lock;
    private Condition condition;

    public MyService(boolean ifFair) {
        this.lock = new ReentrantLock(ifFair);
        this.condition = this.lock.newCondition();
    }

    public void method() {
        try {
            this.lock.lock();
            System.out.println("Thread Name="
                + Thread.currentThread().getName() + "获得锁");
            this.condition.await();
            System.out.println("锁定个数" + this.lock.getHoldCount());
            System.out.println("正在等待锁的线程个数" + this.lock.getQueueLength());
            System.out.println("正在等待condition的线程个数"
                + this.lock.getWaitQueueLength(this.condition));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.lock.unlock();
        }
    }
}
