package com.testReentrantLock.myCondition.fairOrUnFair;

public class Run {
    public static void main(String[] args) {
        final MyService service = new MyService(false);
//        final MyService service = new MyService(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Name="
                    + Thread.currentThread().getName() + "开始运行");
                service.method();
            }
        };
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 20; i++) {
            threads[i].start();
        }
    }
}
