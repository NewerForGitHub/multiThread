package com.myInnerClass;

import com.myInnerClass.OutClass.InnerClass1;
import com.myInnerClass.OutClass.InnerClass2;

public class Run {
    public static void main(String[] args) {
        final InnerClass1 in1 = new InnerClass1();
        final InnerClass2 in2 = new InnerClass2();
        new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);//�����������in2
            }
        }, "T1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();//�����������in1,��˺�in1.method1(in2)�������첽ִ�е�
            }
        }, "T2").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();//�����������in2,��˺�in1.method1(in2)������ͬ��ִ�е�
            }
        }, "T3").start();
    }
}
