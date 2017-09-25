package com.myThreadLocal.threadLocal;

public class MyThreadLocal extends ThreadLocal<String> {
    @Override
    protected String initialValue() {
        return new String("初始化字符串");
    }
}
