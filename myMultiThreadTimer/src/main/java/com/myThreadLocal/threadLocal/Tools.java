package com.myThreadLocal.threadLocal;

import java.util.Date;

public class Tools {
    public static ThreadLocal<Date> t = new ThreadLocal<>();
}
