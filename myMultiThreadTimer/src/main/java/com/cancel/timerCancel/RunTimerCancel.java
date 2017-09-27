package com.cancel.timerCancel;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunTimerCancel {
    public static void main(String[] args) {
        System.out.println("当前时间" + new Date());
        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.SECOND, 2);
        Date runTime1 = calendar1.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.SECOND, 3);
        Date runTime2 = calendar2.getTime();

        Timer timer = new Timer();
        timer.schedule(new MyTask1(), runTime1, 2000);
        timer.schedule(new MyTask2(), runTime2, 2000);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();//可能会失败，原因是：没有抢到锁
    }
}

class MyTask1 extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务1执行" + new Date());
    }
}

class MyTask2 extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务2执行" + new Date());
    }
}