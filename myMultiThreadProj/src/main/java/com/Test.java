package com;

public class Test {

    public static void main(String[] args) {
        new MyThread().run();
    }

}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}