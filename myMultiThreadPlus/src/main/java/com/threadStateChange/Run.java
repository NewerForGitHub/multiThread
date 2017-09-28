package com.threadStateChange;

public class Run {
    //NEW,至今尚未启动的线程的状态
    //RUNNABLE,正在JVM中执行的线程的状态
    //BLOCKED,受阻塞并等待某个对象监视器锁的线程的状态
    //WAITING,无限期等待另一线程来执行某一特定操作的线程的状态
    //TIMED_WAITING,等待另一线程来执行操作取决于等待时间的线程的状态
    //TERMINATED;已退出的线程
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThreadA t = new MyThreadA(service);
        System.out.println("main方法中的状态1：" + t.getState());
        Thread.sleep(1000);
        t.setName("a");
        t.start();
        Thread.sleep(1000);
        System.out.println("main方法中的状态2：" + t.getState());
        Thread.sleep(2000);
        System.out.println("main方法中的状态3：" + t.getState());
    }
}
