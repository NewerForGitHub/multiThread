package com.myJoin.exception;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        Thread.sleep(500);
        ThreadC c = new ThreadC(b);
        c.start();
    }
}
