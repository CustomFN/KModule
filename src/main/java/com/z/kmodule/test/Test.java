package com.z.kmodule.test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.commons.collections.CollectionUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Map<Integer, Boolean> map = Maps.newHashMap();
        map.put(1, Boolean.TRUE);
        map.put(2, Boolean.FALSE);

//        if (map.get(3) != null && map.get(3)) {
//            System.out.println("TRUE");
//        } else {
//            System.out.println("FALSE");
//        }

//        Set<Long> set = Sets.newHashSet(1L, 2L);
//        System.out.println(set.contains(1L));
//        System.out.println(set.contains(3L));
//        System.out.println(set.contains(4));
//        System.out.println(set.contains(null));

        List<Integer> orgIds = Lists.newArrayList(2969);
        List<Integer> grayIds = Lists.newArrayList(2968, 2967);
        System.out.println(CollectionUtils.containsAny(grayIds, orgIds));
    }
}
