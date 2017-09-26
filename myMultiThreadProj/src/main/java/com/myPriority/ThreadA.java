package com.myPriority;

public class ThreadA extends Thread {

    private long count = 0;

    public long getCount() {
        return this.count;
    }

    @Override
    public void run() {
        while (true) {
            this.count++;
        }
    }

}
