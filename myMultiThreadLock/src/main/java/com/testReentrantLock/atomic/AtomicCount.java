package com.testReentrantLock.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCount {
    private static AtomicInteger count = new AtomicInteger(0);

    public static void inc() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        AtomicCount.count.incrementAndGet();
    }

    public static int getCount() {
        return AtomicCount.count.intValue();
    }
}
