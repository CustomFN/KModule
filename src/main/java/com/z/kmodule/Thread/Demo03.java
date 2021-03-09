package com.z.kmodule.Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo03 {

    private static ExecutorService executorService = new ThreadPoolExecutor(10, 20, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));

    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        for (int i = 0; i < 20; i++) {
            executorService.execute(() -> {
                demo03.doExec();
            });
        }
    }

    public  void doExec() {
        int num = 0;
        num += 1;
        System.out.println(Thread.currentThread().getName() + " = " + num);
    }
}
