package com.singleton.enumSingleton;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(SingletonFactory.singletonFactory.getSingleton()
            .hashCode());
    }

}
