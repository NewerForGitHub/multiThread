package com.threadStateChange;

public class MyService {

    synchronized public void service() {
        System.out.println(Thread.currentThread().getName() + "进入了业务方法");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
