package com.singleton.syncBlockLazyMan;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //效率低下，每次都会走同步块儿
        synchronized (Singleton.class) {
            if (Singleton.singleton == null) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Singleton.singleton = new Singleton();
            }
        }
        return Singleton.singleton;
    }
}
