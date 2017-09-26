package com.mySynchroBlockthis;

public class MyThread2 extends Thread {

    private Task task;

    public MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        this.task.doLongTimeTask();
    }

}
