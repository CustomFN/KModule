package com.z.kmodule.guava.demo01;

import com.alibaba.fastjson.JSON;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Maps;
import org.apache.commons.collections.MapUtils;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Demo01 {

    private static Cache<Integer, Map<Integer, String>> localCache = CacheBuilder.newBuilder().initialCapacity(5).maximumSize(20).expireAfterAccess(100, TimeUnit.MILLISECONDS).build();

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 1, 3, 1, 4, 5, 4};
        int[] arr = new int[]{1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            Map<Integer, String> map = Maps.newHashMap();
            int num = arr[i];

            Map<Integer, String> ifPresent = localCache.getIfPresent(num);
            if (MapUtils.isNotEmpty(ifPresent)) {
                System.out.println("num = "+ num + " exist isPresent = " + JSON.toJSONString(ifPresent));
                toSleep();
                continue;
            }

            map.put(num, String.valueOf(num));
            System.out.println("num = "+ num + " new map = " + JSON.toJSONString(map));
            localCache.put(num, map);
            toSleep();
        }

    }

    public static void toSleep() {
        try {
            Thread.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
