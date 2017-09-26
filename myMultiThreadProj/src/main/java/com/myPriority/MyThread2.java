package com.myPriority;

import java.util.Random;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                new Random().nextInt();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("������ Thread 1 use time = " + (end - start));
    }

}
