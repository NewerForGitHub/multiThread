package com.myJoin.test1;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 1000);
            Thread.sleep(secondValue);
            System.out.println(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
