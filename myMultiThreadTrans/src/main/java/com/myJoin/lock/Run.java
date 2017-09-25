package com.myJoin.lock;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB(a);
        ThreadC c = new ThreadC(a);
        b.start();
        Thread.sleep(1000);
        c.start();
    }
}
