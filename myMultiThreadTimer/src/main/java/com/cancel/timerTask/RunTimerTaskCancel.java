package com.cancel.timerTask;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunTimerTaskCancel {
    public static void main(String[] args) {
        System.out.println("当前时间" + new Date());
        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.SECOND, 10);
        Date runTime1 = calendar1.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.SECOND, 10);
        Date runTime2 = calendar2.getTime();

        new Timer().schedule(new MyTask1(), runTime1, 1000);
        new Timer().schedule(new MyTask2(), runTime2, 1000);

    }
}

class MyTask1 extends TimerTask {

    @Override
    public void run() {
        System.out.println("任务1执行" + new Date());
        this.cancel();
    }
}

class MyTask2 extends TimerTask {

    @Override
    public void run() {
        System.out.println("任务2执行" + new Date());
    }
}