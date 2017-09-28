package com.threadStateChange;

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.setName("a");
        a.start();
        MyThreadB b = new MyThreadB(service);
        b.setName("b");
        b.start();
        Thread.sleep(1000);
        System.out.println("main中b线程的状态为" + b.getState());
    }
}
