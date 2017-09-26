package com.myDeadThread;

public class DeadThread implements Runnable {

    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        if (this.username.equals("a")) {
            synchronized (this.lock1) {
                try {
                    System.out.println("username = " + this.username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this.lock2) {
                    System.out.println("��lock1 -> lock2����˳��ִ����");
                }
            }
        }
        if (this.username.equals("b")) {
            synchronized (this.lock2) {
                try {
                    System.out.println("username = " + this.username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this.lock1) {
                    System.out.println("��lock2 -> lock1����˳��ִ����");
                }
            }
        }

    }

}
