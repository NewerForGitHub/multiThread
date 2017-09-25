package com.testReentrantLock.atomic;

public class MyMain {

    public static void main(String[] args) throws InterruptedException {
        MyMain.incByLock();
        MyMain.incByCAS();
        Thread.sleep(5000);
        System.out.println("Count.count=" + Count.getCount());
        System.out.println("AtomicCount.count=" + AtomicCount.getCount());
    }

    private static void incByLock() {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Count.inc();
                }
            }).start();
        }
    }

    private static void incByCAS() {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    AtomicCount.inc();
                }
            }).start();
        }
    }
}
