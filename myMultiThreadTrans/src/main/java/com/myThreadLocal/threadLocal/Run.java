package com.myThreadLocal.threadLocal;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        a.start();
        Thread.sleep(1000);
        ThreadB b = new ThreadB();
        b.start();
    }

}
