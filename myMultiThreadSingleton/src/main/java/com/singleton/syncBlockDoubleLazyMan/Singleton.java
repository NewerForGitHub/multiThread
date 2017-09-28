package com.singleton.syncBlockDoubleLazyMan;


public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //效率较高
        if (Singleton.singleton == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Singleton.class) {
                if (Singleton.singleton == null) {
                    Singleton.singleton = new Singleton();
                }
            }
        }
        return Singleton.singleton;
    }
}
