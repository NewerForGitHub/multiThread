package com.circle.taskAfterNow;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunTask {
    public static void main(String[] args) {
        System.out.println("当前时间" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date runTime = calendar.getTime();

        new Timer().schedule(new MyTask(), runTime, 2000);
    }
}

class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("任务执行" + new Date());
    }
}
