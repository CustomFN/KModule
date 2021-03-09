package com.z.kmodule.jdk.map.merge;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapMerge {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(1);
            add(2);
            add(1);
        }};

        Map<Integer, Integer> map = Maps.newHashMap();
        list.forEach(item -> map.merge(item, 1, Integer::sum));
        System.out.println(JSON.toJSONString(map));
    }
}
