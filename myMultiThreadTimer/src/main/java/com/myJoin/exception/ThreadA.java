package com.myJoin.exception;

public class ThreadA extends Thread {

    @Override
    public void run() {
        for (; true;) {
            new String();
            Math.random();
        }
    }

}
