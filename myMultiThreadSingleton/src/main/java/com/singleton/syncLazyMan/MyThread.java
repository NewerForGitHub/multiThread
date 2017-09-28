package com.singleton.syncLazyMan;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Singleton.getInstance().hashCode());
    }

}
