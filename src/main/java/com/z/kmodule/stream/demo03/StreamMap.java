package com.z.kmodule.stream.demo03;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Function;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.z.kmodule.stream.demo01.User;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMap {

    private static Splitter SPLITTER = Splitter.on(",").omitEmptyStrings().trimResults();

    public static void main(String[] args) {
//        String str = "1,2, 3, 4,5,6, 7";
//        final List<Integer> list = SPLITTER.splitToList(str).stream().map(Integer::parseInt).collect(Collectors.toList());
//
//        System.out.println(JSON.toJSONString(list));
//
//        list.add(1000);
//        System.out.println(JSON.toJSONString(list));
//
//        Integer mmm = 1;
////        mmm.lo
//        System.out.println(Long.valueOf(mmm));
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(2));
//        System.out.println(list.contains(3));
//        System.out.println(list.contains(7));
//        System.out.println(list.contains(8));


//        Map<Integer, Long> map = Maps.newHashMap();
//        map.put(1, 1L);
//        map.put(2, 2L);
//        map.put(3, 3L);
//        long num = 1;
//        System.out.println(map.get(Long.valueOf(num).intValue()));

//        User user1 = new User("1", 1, "1");
//        User user2 = new User("2", 2, "2");
//        List<User> list = Lists.newArrayList(user1, user2);
//        Map<String, User> map = Maps.uniqueIndex(list, new Function<User, String>() {
//            @NullableDecl
//            @Override
//            public String apply(@NullableDecl User user) {
//                return user.getName();
//            }
//        });
//        System.out.println(JSON.toJSONString(map));
//        System.out.println(JSON.toJSONString(list));
//        list = Lists.newArrayList(map.values());
//        System.out.println(JSON.toJSONString(map));
//        System.out.println(JSON.toJSONString(list));

        Set<Integer> set1 = Sets.newHashSet(1, 2, 3);
        Set<Integer> set2 = Sets.newHashSet(2, 3, 4);
        Set<Integer> difference = Sets.difference(set1, set2);
        Set<Integer> intersection = Sets.intersection(set1, set2);
        System.out.println(difference);
        System.out.println(intersection);
        System.out.println(set1);
    }
}
