package com.z.kmodule.Thread;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

public class Demo04 {

    private static final Map<Integer, String> resultMap = Maps.newHashMap();

    private static ExecutorService executorService = new ThreadPoolExecutor(10, 50, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));

    public static void main(String[] args) {
//        CountDownLatch latch = new CountDownLatch(5000);
//        for (int i = 0; i < 5000; i++) {
//            try {
//                int num = i;
//                executorService.execute(() -> {
//                    resultMap.put(num, " " + num);
//                });
//            } catch (Exception e) {
//                System.out.println(" error num -> " + i);
//            } finally {
//                latch.countDown();
//            }
//        }
//
//        try {
//            latch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(JSON.toJSON(resultMap));

//        String content = "2a";
//        Integer value = Ints.tryParse(content);
//        System.out.println(value);

//        List<Long> list1 = Lists.newArrayList(1L);
//        Set<Long> set1 = Sets.newHashSet(1L, 2L, 3L);
//        List<Long> list2 = Lists.newArrayList(list1);
//        list2.removeAll(set1);
//        for (Long i : list2) {
//            System.out.println("no " + i);
//        }
//        list1.retainAll(set1);
//        System.out.println(JSON.toJSONString(list1));


//        List<String> brandList = Lists.newArrayList();
//        String brandName1 = "大品牌1啊啊啊啊";
//        String brandName2 = "大品牌12啊啊啊啊";
//        String brandName3 = "大品牌3啊啊啊啊";
//        String brandName4 = "大品牌4啊啊啊啊";
//        List<String> brandNameList = Lists.newArrayList(brandName1, brandName2, brandName3, brandName4);
//        for (String brandName : brandNameList) {
//            if (brandName.contains("牌1")) {
//                brandList.add(brandName);
//            }
//        }

        List<Integer> listAll = Lists.newArrayList();
        for (int i = 1; i < 1000000; i++) {
            listAll.add(i);
        }
        List<Integer> list1 = Lists.newArrayList();
        for (int i = 40000; i < 50000; i++) {
            list1.add(i);
        }
        List<Integer> list2 = Lists.newArrayList();
        for (int i = 50000; i < 60000; i++) {
            list2.add(i);
        }
        List<Integer> list3 = Lists.newArrayList();
        for (int i = 90000; i < 100000; i++) {
            list3.add(i);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        list1.retainAll(listAll);
        list2.retainAll(listAll);
        list3.retainAll(listAll);

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
//        System.out.println(JSON.toJSONString(brandList));
    }
}
