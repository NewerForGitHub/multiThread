package com.myCAS;

import java.util.concurrent.atomic.AtomicInteger;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger();
        LinkedQueue<String> queue = new LinkedQueue<>();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int andIncrement = count.getAndIncrement();
                    System.out.println("添加字符串abcd" + andIncrement);
                    queue.add("abcd");
                }
            });
            thread.join();
            thread.start();
        }
        while (count.intValue() != 100) {
            System.out.println(count.intValue());
        }
        System.out.println(queue);
    }
}
