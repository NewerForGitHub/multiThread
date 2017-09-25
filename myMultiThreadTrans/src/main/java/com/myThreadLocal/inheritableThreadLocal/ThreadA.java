package com.myThreadLocal.inheritableThreadLocal;

public class ThreadA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("在ThreadA中取值为：" + Tools.t.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ThreadB b = new ThreadB();
        b.start();
    }
}
