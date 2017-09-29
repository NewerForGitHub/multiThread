package com.simpleDateFormatTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Run2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStrings = new String[] { "2017-01-07", "2017-02-08",
            "2017-03-09", "2017-04-10", "2017-05-11", };
        for (String dateString : dateStrings) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Date date = sdf.parse(dateString);
                        String newDateString = sdf.format(date);
                        if (!dateString.equals(newDateString)) {
                            System.out.println("ThreadName="
                                + Thread.currentThread().getName() + "报错，日期字符串"
                                + dateString + "转换为" + newDateString);
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
