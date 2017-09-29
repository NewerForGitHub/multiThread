package com.simpleDateFormatTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Run3 {
    public static void main(String[] args) {
        String[] dateStrings = new String[] { "2017-01-07", "2017-02-08",
            "2017-03-09", "2017-04-10", "2017-05-11", };
        for (String dateString : dateStrings) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Date date = DateTools.parse(dateString);
                    String newDateString = DateTools.format(date);
                    if (!dateString.equals(newDateString)) {
                        System.out.println("ThreadName="
                            + Thread.currentThread().getName() + "报错，日期字符串"
                            + dateString + "转换为" + newDateString);
                    }
                }
            }).start();
        }
    }

    static class DateTools {
        private static ThreadLocal<SimpleDateFormat> t = new ThreadLocal<>();

        public static Date parse(String dateString) {
            SimpleDateFormat tsdf = DateTools.t.get();
            if (tsdf == null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                DateTools.t.set(sdf);
                tsdf = sdf;
            }
            try {
                return tsdf.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        }

        public static String format(Date date) {
            SimpleDateFormat tsdf = DateTools.t.get();
            if (tsdf == null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                DateTools.t.set(sdf);
                tsdf = sdf;
            }
            return tsdf.format(date);
        }
    }
}
