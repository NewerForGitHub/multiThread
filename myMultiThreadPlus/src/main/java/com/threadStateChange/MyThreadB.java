package com.threadStateChange;

public class MyThreadB extends Thread {
    private MyService service;

    public MyThreadB(MyService service) {
        this.service = service;
        System.out.println("构造函数中b的线程状态：" + this.getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中b的线程状态：" + this.getState());
        this.service.service();
    }

}
