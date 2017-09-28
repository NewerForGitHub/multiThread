package com.serialize.innerStaticClass;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 2702358079818490000L;

    private static class SingletonHandler {
        private static Singleton singleton = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        //立即加载
        return SingletonHandler.singleton;
    }

    protected Object readResovle() {
        System.out.println("调用readResovle方法");
        return SingletonHandler.singleton;
    }
}
