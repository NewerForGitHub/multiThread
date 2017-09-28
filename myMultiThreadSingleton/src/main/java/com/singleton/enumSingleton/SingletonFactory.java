package com.singleton.enumSingleton;

// 违反单一职责原则，解决办法：将枚举类声明为单例类的内部类
public enum SingletonFactory {
    singletonFactory;
    private Singleton singleton;

    private SingletonFactory() {
        this.singleton = Singleton.getInstance();
    }

    public Singleton getSingleton() {
        //立即加载
        return this.singleton;
    }
}
