package com.singleton.lazyMan;

public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread();
        MyThread b = new MyThread();
        MyThread c = new MyThread();
        MyThread d = new MyThread();
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
