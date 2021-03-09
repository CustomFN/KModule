package com.z.kmodule.stream.demo05;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestFlatMap {

    public static void main(String[] args) {
        List<String> first= Arrays.asList("one", "two", "three", "four");
        List<String> second= Arrays.asList("A", "B", "C", "D");

//        first.stream()
//                .flatMap(f -> second.stream().map(s -> String.format("%s,%s ", f, s)))
//                .forEach(System.out::println);


        List<Integer> list1 = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = Lists.newArrayList(4, 5, 6);

        int pageNo = 4;
        int pageSize = 2;

        List<Integer> collect = list1.stream().skip((pageNo - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
        System.out.println(collect);

//        JSONArray ja1 = new JSONArray();
//        for (Integer i : list1) {
//            JSONObject jo = new JSONObject();
//            jo.put("brandId", i);
//            jo.put("brandName", "brandName " + i);
//            ja1.add(jo);
//        }
//        JSONArray ja2 = new JSONArray();
//        for (Integer i : list2) {
//            JSONObject jo = new JSONObject();
//            jo.put("brandId", i);
//            jo.put("brandName", "brandName " + i);
//            ja2.add(jo);
//        }
//
//        Map<Integer, String> map1 = Maps.newHashMap();
//        map1.put(1, "1");
//        map1.put(2, "2");
//
//        Map<Integer, String> map2 = Maps.newHashMap();
//        map2.put(3, "3");
//        map2.put(4, "4");
//
//        JSONObject data = new JSONObject();
//        data.put("hasNotRelPoiBrands", map1);
//        data.put("hasRelCusBrands", map2);
//
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("msg", "success");
//        jsonObject.put("code", 0);
//        jsonObject.put("data", data);
//        System.out.println(jsonObject);
    }
}
