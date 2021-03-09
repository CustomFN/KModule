package com.z.kmodule.concurrent.demo02;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceTest {

    private static final ExecutorService executorService = new ThreadPoolExecutor(2, 5, 0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingDeque<>(5), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        ConcurrentHashMap map = new ConcurrentHashMap<String, String>();
        List<Future<?>> futureList = Lists.newArrayList();

        for (Integer num : list) {
            try {
                futureList.add(executorService.submit(() -> {
                    try {
                        Thread.sleep(1000);
                        if (num % 2 == 0) {
                            throw new RuntimeException(" "+ num);
                        }
                        if (num % 3 == 0) {
                            throw new InterruptedException(" " + num);
                        }
                    } catch (InterruptedException e) {
                        map.put(num + "", "出错了 InterruptedException" + e.getMessage());
                    } catch (Exception e) {
                        map.put(num + "", "出错了 Exception" + e.getMessage());
                    }
                    System.out.println(Thread.currentThread().getName() + " end");
                }));
            } catch (Exception e) {
                map.put(num + "", "线程池满了");
            }

            System.out.println(" end " + num);
        }

        for (Future<?> future : futureList) {
            future.get();
        }

        System.out.println(JSON.toJSONString(map));
        System.out.println(" all end");

        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());

        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
    }
}
