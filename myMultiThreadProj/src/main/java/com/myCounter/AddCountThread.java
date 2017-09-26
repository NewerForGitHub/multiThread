package com.myCounter;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread implements Runnable {

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(this.count.incrementAndGet());
        }
    }

}
