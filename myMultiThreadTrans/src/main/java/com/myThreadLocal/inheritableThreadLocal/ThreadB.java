package com.myThreadLocal.inheritableThreadLocal;

public class ThreadB extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("在ThreadB中取值为：" + Tools.t.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
