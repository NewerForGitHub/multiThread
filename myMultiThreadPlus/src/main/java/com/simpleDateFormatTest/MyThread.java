package com.simpleDateFormatTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {

    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date date = this.sdf.parse(this.dateString);
            String newDateString = this.sdf.format(date);
            if (!this.dateString.equals(newDateString)) {
                System.out.println("ThreadName=" + this.getName() + "报错，日期字符串"
                    + this.dateString + "转换为" + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
