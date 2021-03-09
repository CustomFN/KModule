package com.z.kmodule.stream.demo03;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Data
public class OpResult {

    Map<Integer, String> map = new ConcurrentHashMap<>();

    List<Integer> list = Lists.newArrayList();

    public List<Integer> getList() {
        list.clear();
        list.add(1);
        list.add(2);
        return list;
    }
}
