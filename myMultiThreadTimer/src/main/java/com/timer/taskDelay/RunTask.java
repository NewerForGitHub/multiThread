package com.timer.taskDelay;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunTask {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("当前开始时间1" + new Date());
        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.SECOND, 2);
        Date runTime1 = calendar1.getTime();

        System.out.println("当前开始时间2" + new Date());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.SECOND, 4);
        Date runTime2 = calendar2.getTime();

        Timer timer = new Timer();
        System.out.println("任务1计划时间" + runTime1);
        timer.schedule(new MyTask1(), runTime1);
        System.out.println("任务2计划时间" + runTime2);
        timer.schedule(new MyTask2(), runTime2);

        Thread.sleep(20000);
        System.exit(0);
    }
}

class MyTask1 extends TimerTask {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务1执行" + new Date());
    }
}

class MyTask2 extends TimerTask {

    @Override
    public void run() {
        System.out.println("任务2执行" + new Date());
    }
}