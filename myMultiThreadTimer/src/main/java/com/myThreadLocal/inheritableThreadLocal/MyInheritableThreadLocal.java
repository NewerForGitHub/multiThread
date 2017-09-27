package com.myThreadLocal.inheritableThreadLocal;

import java.util.Date;

public class MyInheritableThreadLocal extends InheritableThreadLocal<String> {

    @Override
    protected String initialValue() {
        return new Date().getTime() + "";
    }

    @Override
    protected String childValue(String parentValue) {
        return parentValue + "，子线程添加";
    }

}
