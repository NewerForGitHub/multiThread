package com.concurrent;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class TestExecutorService {
    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> future = executor.submit(new Callable<String>() {
            @Override
            public String call() {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });
        System.out.println("future.get() = " + future.get());
    }

    @Test
    public void testExecutor() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables = new HashSet<>();
        callables.add(new Callable<String>() {
            @Override
            public String call() {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() {
                return "Task 3";
            }
        });

        String result = executorService.invokeAny(callables);
        System.out.println("result = " + result);
        executorService.shutdown();
    }
}
