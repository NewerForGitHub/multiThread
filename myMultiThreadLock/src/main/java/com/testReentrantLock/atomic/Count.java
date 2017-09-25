package com.testReentrantLock.atomic;

public class Count {

    private static int count = 0;

    public static void inc() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Count.count++;
    }

    public static int getCount() {
        return Count.count;
    }

}
