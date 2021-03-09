package com.z.kmodule.stream.demo03;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Test {

    private static ExecutorService executorService = new ThreadPoolExecutor(10, 20, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(100));

    public static void main(String[] args) {

//        List<Integer> list1 = Lists.newArrayList(1, 2, 3);
//        swap(list1);
//
//        System.out.println("-- " + JSON.toJSON(list1));

//        HashSet<Integer> integers = Sets.newHashSet(1, 2, 3);
//        for (Integer i : integers) {
//            System.out.println(i);
//        }

//        OpResult opResult = new OpResult();
//        Map<Integer, String> map = opResult.getMap();
//        map.put(1, "1");
//
//        System.out.println(map);
//        swap(opResult);
//        System.out.println(map);

        OpResult opResult = new OpResult();
        Map<Integer, String> map = opResult.getMap();

        CountDownLatch latch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            int num = i;
            executorService.execute(() -> {
                try {
                    Thread.sleep((long) (Math.random() * 100));
                    map.put(num, " " + num);
                } catch (InterruptedException e) {

                } finally {
                    latch.countDown();
                }
            });
        }

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(JSON.toJSON(map));
//        List<Integer> list = Lists.newArrayList(1, 2, 2, 3);
//        opResult.setList(list);
//        System.out.println(opResult);
//        iterator(list);
//        System.out.println(list);
//        retain(opResult);
//        List<Integer> list2 = Lists.newArrayList( 2, 3,4, 5);
//        ArrayList<Integer> integers = Lists.newArrayList(list);
//        integers.removeAll(list2);
//        System.out.println(list);
//        System.out.println(list2);
//        System.out.println(integers);
//        clear(opResult);
//        list.clear();
//        System.out.println(opResult.getList());
//        System.out.println(list);
    }

    public static void clear(OpResult opResult) {
        List<Integer> list = opResult.getList();
        list.stream().forEach(System.out::println);
    }

    public static void iterator(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.equals(2)) {
                iterator.remove();
            }
        }
    }

    public static void  retain(OpResult opResult) {
        List<Integer> list = opResult.getList();
        List<Integer> collect = Lists.newArrayList(2);
        list.retainAll(collect);
    }

    public static void swap(OpResult opResult) {
        Map<Integer, String> map = opResult.getMap();
        map.put(2, "2");
    }
}
