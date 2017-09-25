package com.myJoin.lock;

public class ThreadA extends Thread {

    @Override
    public void run() {
        System.out.println("begin:" + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("  end:" + System.currentTimeMillis());
    }

    synchronized public void aService() {
        System.out.println("调用ThreadA的服务方法");
    }

}
