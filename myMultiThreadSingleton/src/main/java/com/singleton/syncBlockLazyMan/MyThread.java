package com.singleton.syncBlockLazyMan;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Singleton.getInstance().hashCode());
    }

}
