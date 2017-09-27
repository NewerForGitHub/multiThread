package com.myWaitNotifyInsert;

public class DBTools {
    //volatile在本案例中效果不明显，原因猜测，只有一个DBTools对象，且该对象的所有方法都是串行的
    volatile private boolean prevIsA = false;

    synchronized public void backupA() {
        try {
            while (this.prevIsA) {
                this.wait();
            }
//            for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "★★★★★");
//            }
            this.prevIsA = true;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (!this.prevIsA) {
                this.wait();
            }
//            for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "☆☆☆☆☆");
//            }
            this.prevIsA = false;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
