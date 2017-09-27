package com.myThreadLocal.threadLocal;

import java.util.Date;

public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.t.get() == null) {
                    Tools.t.set(new Date());
                }
                System.out.println("A " + Tools.t.get().getTime());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
