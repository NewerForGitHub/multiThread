package com.myPriority;

public class ThreadB extends Thread {

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
