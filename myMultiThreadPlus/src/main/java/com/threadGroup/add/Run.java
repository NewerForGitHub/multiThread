package com.threadGroup.add;

public class Run {
    public static void main(String[] args) {
        ThreadGroup g = new ThreadGroup("我的线程组");
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        Thread threadA = new Thread(g, a);
        Thread threadB = new Thread(g, b);
        threadA.start();
        threadB.start();
        System.out.println("活动的线程数为：" + g.activeCount());
        System.out.println("线程组的名称为：" + g.getName());
    }
}
