package com.myCounter;

public class Counter {

    public static volatile Integer count = 0;

    public static Object obj = new Object();

    public static void inc() {

        // �����ӳ�1���룬ʹ�ý������
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }

        Counter.count = Counter.count + 1;
    }

    public static void main(String[] args) {

//		while (true) {
        // ͬʱ����1000���̣߳�ȥ����i++���㣬����ʵ�ʽ��

        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // Callable<ICount> c1 = () -> () -> {
                    // try {
                    // Thread.sleep(1);
                    // } catch (InterruptedException e) {
                    // }
                    // count++;
                    // };
                    // try {
                    // c1.call().inc();
                    // } catch (Exception e) {
                    // e.printStackTrace();
                    // }
                    Counter.inc();
                }
            }).start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ����ÿ�����е�ֵ���п��ܲ�ͬ,����Ϊ1000
        System.out.println("���н��:Counter.count=" + Counter.count);
        try {
            Thread.sleep(2000);
            Counter.count = 0;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

//}

interface ICount {
    void inc();
}