package com.threadStateChange;

public class MyThreadA extends Thread {
    private MyService service;

    public MyThreadA(MyService service) {
        this.service = service;
        System.out.println("构造函数中a的线程状态：" + this.getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中a的线程状态：" + this.getState());
        this.service.service();
    }

}
