package com.testReentrantLock.myCondition.oneToOne;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conA = this.lock.newCondition();
    private Condition conB = this.lock.newCondition();

    public void awaitA() {
        try {
            this.lock.lock();
            System.out.println("begin awaitA时间为：" + System.currentTimeMillis());
            this.conA.await();
            System.out.println("  end awaitA时间为：" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.lock.unlock();
        }
    }

    public void awaitB() {
        try {
            this.lock.lock();
            System.out.println("begin awaitB时间为：" + System.currentTimeMillis());
            this.conB.await();
            System.out.println("  end awaitB时间为：" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.lock.unlock();
        }
    }

    public void signalA() {
        try {
            this.lock.lock();
            System.out.println("signalA时间为：" + System.currentTimeMillis());
            this.conA.signal();
        } finally {
            this.lock.unlock();
        }
    }

    public void signalB() {
        try {
            this.lock.lock();
            System.out.println("signalB时间为：" + System.currentTimeMillis());
            this.conB.signal();
        } finally {
            this.lock.unlock();
        }
    }
}
