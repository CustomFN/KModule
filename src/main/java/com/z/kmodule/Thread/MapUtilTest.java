package com.z.kmodule.Thread;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.z.kmodule.stream.demo01.User;
import org.apache.commons.collections.MapUtils;
import org.joda.time.DateTime;

import java.util.*;

public class MapUtilTest {

    public static void main(String[] args) {
        Map<Integer, String> map = Maps.newHashMap();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        System.out.println(map.getOrDefault(1, "0"));
        System.out.println(map.getOrDefault(2, "0"));
        System.out.println(map.getOrDefault(3, "0"));
        System.out.println(map.getOrDefault(0, "0"));
        System.out.println(map.getOrDefault(4, "0"));



//        Map<Long, String> map = Maps.newHashMap();
//        map.put(1L, "1");
////        Map<Long, String> map = null;
//
//        System.out.println(MapUtils.isNotEmpty(map));

//        Long a = 11L;
//        Integer b = 2;
//
//        System.out.println(a % b);
//        System.out.println(a / b);
//        System.out.println(a % b > 0 ? a / b + 1 : a / b);
//        int i = (int) (Math.random() * 100) + 1;
//        System.out.println(i);

//        DateTime now = new DateTime();
//        DateTime dateTime = now.minusMonths(12).plusDays(1).withMillisOfDay(0);
//        System.out.println(now.toLocalDateTime());
//        System.out.println(dateTime.toLocalDateTime());
//
//        System.out.println("-----");
//        DateTime tt = now.minusMonths(11).dayOfMonth().withMinimumValue().millisOfDay().withMinimumValue();
//        System.out.println(tt.toLocalDateTime());
//        System.out.println("-----");
//
//        DateTime before = new DateTime(1576043615 * 1000L);
//        if (before.isBefore(now)) {
//            System.out.println("before");
//        } else {
//            System.out.println("no");
//        }


//        StringBuilder sb = new StringBuilder();
//        for (int i = 390495; i < 390522; i++) {
//            sb.append(i).append(",");
//        }
//
//        System.out.println(sb.toString());

//        User user1 = new User();
//        User user11 = new User();
//        user11.setAge(11);
//        User user12 = new User();
//        user12.setAge(12);
//        User user13 = new User();
//        user13.setAge(13);
//        List<User> user1List = Lists.newArrayList(user11, user12, user13);
//        user1.setUserList(user1List);
//
//        User user2 = new User();
//        User user21 = new User();
//        user21.setAge(21);
//        User user22 = new User();
//        user22.setAge(22);
//        User user23 = new User();
//        user23.setAge(23);
//        List<User> user2List = Lists.newArrayList(user21, user22, user23);
//        user2.setUserList(user2List);
//
//        User user3 = new User();
//        User user31 = new User();
//        user31.setAge(31);
//        User user32 = new User();
//        user32.setAge(32);
//        User user33 = new User();
//        user33.setAge(33);
//        List<User> user3List = Lists.newArrayList(user31, user32, user33);
//        user3.setUserList(user3List);
//
//        List<User> userList = Lists.newArrayList(user1, user2, user3);
//
//        System.out.println(JSON.toJSONString(userList));
//
//
//        for (User uuser : userList) {
//            List<User> uuuserList = uuser.getUserList();
//            for (User uuuser : uuuserList) {
//                uuuser.setAge(0);
//            }
//        }
//
//        System.out.println(JSON.toJSONString(userList));

//        User user = new User();
//        user.setAge(18);
//
//        String format = String.format("xxx = %s", JSON.toJSONString(user));
//        System.out.println(format);
    }
}
