package com.singleton.lazyMan;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //在多线程中几乎不能保证单例
        if (Singleton.singleton == null) {
            Singleton.singleton = new Singleton();
        }
        return Singleton.singleton;
    }
}
