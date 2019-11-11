package com.z.kmodule.stream.demo01;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStream {

    private static List<User> users =  Lists.newArrayList();

    static {
        users.add(new User("A", 10, "北京"));
        users.add(new User("B", 20, "上海"));
        users.add(new User("C", 30, "杭州"));
    }

    public static void main(String[] args) {
//        testFilter(users);
//        testMap(users);
//        testDistinct();
//        testSort();
//        testLimit();
//        testSkip();
//        testReduce();
//        testMin();
        testAnyMatch();
    }

    public static void testFilter() {
        List<User> list = users.stream().filter(user -> user.getAge() > 10).collect(Collectors.toList());
        System.out.println(list);
    }

    public static void testMap() {
        List<Integer> list = users.stream().map(user -> user.getAge()).collect(Collectors.toList());
        System.out.println(list);
    }

    public static void testDistinct() {
        List<String> list = Lists.newArrayList("111", "222", "333", "111", "222");
        list.stream().distinct().forEach(System.out::println);
    }

    public static void testSort() {
        List<String> list = Lists.newArrayList("111", "222", "333", "111", "222");
        list.stream().sorted().forEach(System.out::println);
    }

    public static void testLimit() {
        List<String> list = Lists.newArrayList("111", "222", "333", "111", "222");
        list.stream().limit(2).forEach(System.out::println);
    }

    public static void testSkip() {
        List<String> list = Lists.newArrayList("111", "222", "333", "111", "222");
        list.stream().skip(2).forEach(System.out::println);
    }

    public static void testReduce() {
        List<String> list = Lists.newArrayList("111", "222", "333", "111", "222");
        Optional<String> reduce = list.stream().reduce((a, b) -> a + " " + b);
        System.out.println(reduce.isPresent() ? reduce.get() : null);
    }

    public static void testMin() {
        User user = users.stream().min((user1, user2) -> Integer.compare(user1.getAge(), user2.getAge())).get();
        System.out.println(user);
    }

    public static void testAnyMatch() {
        boolean match = users.stream().anyMatch(user -> "北京".equals(user.getAddress()));
        System.out.println("anyMatch: " + match);

        match = users.stream().allMatch(user -> "北京".equals(user.getAddress()));
        System.out.println("allMatch: " + match);

        match = users.stream().noneMatch(user -> "北京".equals(user.getAddress()));
        System.out.println("noneMatch: " + match);
    }
}
