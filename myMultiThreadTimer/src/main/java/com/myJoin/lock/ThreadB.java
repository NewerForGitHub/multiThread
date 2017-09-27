package com.myJoin.lock;

public class ThreadB extends Thread {
    private ThreadA a;

    public ThreadB(ThreadA a) {
        this.a = a;
    }

    @Override
    public void run() {
        synchronized (this.a) {
            this.a.start();
            try {
                this.a.join(6000);
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
