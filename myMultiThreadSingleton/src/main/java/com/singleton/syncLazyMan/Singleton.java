package com.singleton.syncLazyMan;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    synchronized public static Singleton getInstance() {
        //效率低下
        if (Singleton.singleton == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Singleton.singleton = new Singleton();
        }
        return Singleton.singleton;
    }
}
