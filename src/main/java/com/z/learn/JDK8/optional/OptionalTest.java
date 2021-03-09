package com.z.learn.JDK8.optional;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalTest {

    public static void main(String[] args) {
//        Person person = new Person(new Car(new Wheel("BRAND")));
////        Person person = new Person();
//
//        String brand = Optional.ofNullable(person).map(Person::getCar).map(Car::getWheel).map(Wheel::getBrand).orElse("NO");
//        System.out.println(brand);

//        Integer item = null;
//        switch (item) {
//            case 1:
//                System.out.println("1"); return;
//                default:
//                    System.out.println("2");
//        }


//        Integer a = 17;
//        int b = 17;
//        System.out.println(a == 17 || b == 17 );
//        System.out.println((a == 17 || b == 17) && a != b);
//        System.out.println( a != b && a == 17 || b == 17);

//        List<Integer> list1 = Lists.newArrayList(1, 2, 3);
//        list1.stream().forEach(item -> {
//            if (item == 2) {
//                return;
//            }
//
//            System.out.println(item);
//        });

        String format = String.format("%s%s", 1, 2);
        System.out.println(format);

//        List<Integer> list2 = Lists.newArrayList(4, 5);
//        List<Integer> collect = Stream.of(list1, list2).flatMap(type -> type.stream()).collect(Collectors.toList());
//        System.out.println(JSON.toJSONString(collect));

//        RateLimiter limiter_1 = RateLimiter.create(1);
//        RateLimiter limiter_2 = RateLimiter.create(50);
//
//        for (int i = 0; i < 1000; i+=50) {
////            limiter_1.acquire();
//            for (int j = i; j <= i + 50; j++) {
////                limiter_2.acquire();
//                System.out.println(j);
//            }
//        }

//        List<Integer> nums = Lists.newArrayList();
//        for (int i = 0; i < 1000000; i++) {
//            nums.add(i);
//        }
//
//        long startTime = System.currentTimeMillis();
//        nums.forEach(num -> num =+ num);
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
//
//        startTime = System.currentTimeMillis();
//        nums.stream().parallel().forEach(num -> num =+ num);
//        endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);

    }
}
