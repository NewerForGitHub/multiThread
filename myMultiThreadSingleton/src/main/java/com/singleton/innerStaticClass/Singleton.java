package com.singleton.innerStaticClass;

public class Singleton {
    private static class SingletonHandler {
        private static Singleton singleton = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        //立即加载
        //缺点：序列化时不能保证单例性
        return SingletonHandler.singleton;
    }
}
