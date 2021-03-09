package com.z.kmodule.Thread;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.z.kmodule.stream.demo01.User;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class demo01 {
    public static void main(String[] args) {
//        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
//        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
//        for (ThreadInfo info : threadInfos) {
////            System.out.println(info);
//            System.out.println("[" + info.getThreadId() + "] " + info.getThreadName());
//        }

        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5);
//        List<Integer> list1Before = Lists.newArrayList(list.subList(0, 2));
//        List<Integer> list2Before = Lists.newArrayList(list.subList(2, list.size()));
//
//        System.out.println("list before = " + JSON.toJSONString(list));
//        System.out.println("list1Before before = " + JSON.toJSONString(list1Before));
//        System.out.println("list2Before before = " + JSON.toJSONString(list2Before));
//
//        list1Before.add(10);
//        list2Before.add(10);
//
//        System.out.println("list after = " + JSON.toJSONString(list));
//        System.out.println("list1Before after = " + JSON.toJSONString(list1Before));
//        System.out.println("list2Before after = " + JSON.toJSONString(list2Before));

//        int num = 2;
//        List<Integer> list1 = list.stream().limit(num).collect(Collectors.toList());
//        List<Integer> list2 = list.stream().skip(num).limit(list.size()).collect(Collectors.toList());
//        System.out.println("list before = " + JSON.toJSONString(list));
//        System.out.println("list1 before = " + JSON.toJSONString(list1));
//        System.out.println("list2 before = " + JSON.toJSONString(list2));
//        list1.add(10);
//        list2.add(20);
//        System.out.println("list after = " + JSON.toJSONString(list));
//        System.out.println("list1 after = " + JSON.toJSONString(list1));
//        System.out.println("list2 after = " + JSON.toJSONString(list2));

//        System.out.println(Math.random());

//        User user1 = new User("1", 1, "1");
//        User user11 = new User("1", 1, "1");
//        User user2 = new User("2", 2, "2");
//        User user3 = new User("3", 3, "3");
//        User user4 = new User("4", 4, "4");
//        List<User> users = Lists.newArrayList(user1, user2, user3, user4, user11);
//        Map<String, User> map = Maps.uniqueIndex(users, new Function<User, String>() {
//            @NullableDecl
//            @Override
//            public String apply(@NullableDecl User user) {
//                return user.getName();
//            }
//        });
//
//        System.out.println(map.values());
    }
}
