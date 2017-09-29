package com.simpleDateFormatTest;

import java.text.SimpleDateFormat;

public class Run {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStrings = new String[] { "2017-01-07", "2017-02-08",
            "2017-03-09", "2017-04-10", "2017-05-11", };
        for (String dateString : dateStrings) {
            new MyThread(sdf, dateString).start();
        }
    }
}
