package com.testReentrantLock.myCondition.printByOrder;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Run {
    private static int intFlag = 1;
    final private static Lock lock = new ReentrantLock();
    final private static Condition conA = Run.lock.newCondition();
    final private static Condition conB = Run.lock.newCondition();
    final private static Condition conC = Run.lock.newCondition();

    public static void main(String[] args) {
        Runnable rA = new Runnable() {
            @Override
            public void run() {
                try {
                    Run.lock.lock();
                    while (Run.intFlag != 1) {
                        Run.conA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadA " + (i + 1));
                    }
                    Run.intFlag = 2;
                    Run.conB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Run.lock.unlock();
                }
            }
        };
        Runnable rB = new Runnable() {
            @Override
            public void run() {
                try {
                    Run.lock.lock();
                    while (Run.intFlag != 2) {
                        Run.conB.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadB " + (i + 1));
                    }
                    Run.intFlag = 3;
                    Run.conC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Run.lock.unlock();
                }
            }
        };
        Runnable rC = new Runnable() {
            @Override
            public void run() {
                try {
                    Run.lock.lock();
                    while (Run.intFlag != 3) {
                        Run.conC.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadC " + (i + 1));
                    }
                    Run.intFlag = 1;
                    Run.conA.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Run.lock.unlock();
                }
            }
        };
        Thread[] threadA = new Thread[5];
        Thread[] threadB = new Thread[5];
        Thread[] threadC = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threadA[i] = new Thread(rA);
            threadB[i] = new Thread(rB);
            threadC[i] = new Thread(rC);
        }
        for (int i = 0; i < 3; i++) {
            threadA[i].start();
            threadB[i].start();
            threadC[i].start();
        }
    }
}
