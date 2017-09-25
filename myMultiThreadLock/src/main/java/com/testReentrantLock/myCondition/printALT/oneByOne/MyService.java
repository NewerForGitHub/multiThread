package com.testReentrantLock.myCondition.printALT.oneByOne;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = this.lock.newCondition();
    private boolean aFlag = true;

    public void printA() {
        try {
            this.lock.lock();
            while (!this.aFlag) {
                this.condition.await();
            }
            System.out.println("print☆");
            this.condition.signalAll();
            this.aFlag = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.lock.unlock();
        }
    }

    public void printB() {
        try {
            this.lock.lock();
            while (this.aFlag) {
                this.condition.await();
            }
            System.out.println("print★★");
            this.condition.signalAll();
            this.aFlag = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.lock.unlock();
        }
    }
}
