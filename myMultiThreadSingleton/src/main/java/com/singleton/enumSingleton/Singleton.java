package com.singleton.enumSingleton;

public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        //立即加载
        //缺点：不能有其他实例变量，因为该方法没有同步设置，可能会出现线程安全问题
        return new Singleton();
    }
}
