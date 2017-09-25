package com.myJoin.joinMillis;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("begin:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
