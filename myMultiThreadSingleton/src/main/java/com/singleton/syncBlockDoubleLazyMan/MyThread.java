package com.singleton.syncBlockDoubleLazyMan;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Singleton.getInstance().hashCode());
    }

}
