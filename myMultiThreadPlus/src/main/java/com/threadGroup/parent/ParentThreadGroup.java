package com.threadGroup.parent;

public class ParentThreadGroup {
    public static void main(String[] args) {
        ThreadGroup g = Thread.currentThread().getThreadGroup();
        String prex = "当前线程";
        String suff = "的名称是:";
        while ((g = g.getParent()) != null) {
            prex += "的父线程组";
            System.out.println(prex + suff + g.getName());
        }
    }
}
