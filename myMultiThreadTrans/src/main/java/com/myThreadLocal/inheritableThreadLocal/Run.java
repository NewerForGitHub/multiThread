package com.myThreadLocal.inheritableThreadLocal;

public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main中取值为：" + Tools.t.get());
                Thread.sleep(100);
            }
            Thread.sleep(3000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
