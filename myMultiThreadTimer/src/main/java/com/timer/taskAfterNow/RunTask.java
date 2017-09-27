package com.timer.taskAfterNow;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunTask {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("当前时间" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date runTime = calendar.getTime();

        //任务结束时不停止运行，查看Timer源码可知，new Timer()会启动一个新线程，且新线程不是守护线程
//        new Timer().schedule(new MyTask(), runTime);
        //设置为true，将Timer启动的线程改为守护线程，并且在main结束时结束线程
        new Timer(true).schedule(new MyTask(), runTime);
        Thread.sleep(15000);
    }
}

class MyTask extends TimerTask {

    @Override
    public void run() {
        while (true) {
            System.out.println("任务执行" + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
