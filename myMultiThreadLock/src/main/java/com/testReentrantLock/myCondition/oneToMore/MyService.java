package com.testReentrantLock.myCondition.oneToMore;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = this.lock.newCondition();

    public void await() {
        try {
            this.lock.lock();
            System.out.println(" await时间为：" + System.currentTimeMillis());
            this.condition.await();
            System.out.println(" await结束时间" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.lock.unlock();
        }
    }

    public void signal() {
        this.lock.lock();
        System.out.println("signal时间为：" + System.currentTimeMillis());
        this.condition.signal();
        this.lock.unlock();
    }
}
