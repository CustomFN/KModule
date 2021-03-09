package com.z.kmodule.mybatis.demo01;

import com.github.pagehelper.Page;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestPage {

    public static void main(String[] args) {
        int pageNo = 1;
        int pageSize = 5;

        Page<Integer> page = new Page<>(pageNo, pageSize, true);
        page.add(1);
        page.add(2);
        page.add(3);
        page.add(4);
        page.add(5);
        page.add(6);
        page.add(7);

//        System.out.println(page.getTotal());
//        System.out.println(String.format("Total = %d, Pages = %d, PageNum = %d", page.getTotal(), page.getPages(), page.getPageNum()));
//
//        page.setTotal(page.size());
//        System.out.println(page.getTotal());
//        System.out.println(String.format("Total = %d, Pages = %d, PageNum = %d", page.getTotal(), page.getPages(), page.getPageNum()));
//
//        List<Integer> collect = page.stream().skip((pageNo - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
//        System.out.println(collect);
//
//        collect = page.stream().skip(pageNo * pageSize + 5).limit(pageSize).collect(Collectors.toList());
//        System.out.println(collect);

        Integer num = 1;
        String name = num != null ? "aaa" : "";
        System.out.println(name);

        List<Integer> list = Lists.newArrayList(1);
        List<Integer> notExistList = Lists.newArrayList(list);
        System.out.println(notExistList);

        notExistList.removeAll(null);
        System.out.println(notExistList);
    }
}
