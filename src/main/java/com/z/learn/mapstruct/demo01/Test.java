package com.z.learn.mapstruct.demo01;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.z.learn.mapstruct.demo02.TestUserConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        UserFrom userFrom = new UserFrom(1, "1", true, TypeEnum.TYPE_A);
//        set(userFrom);
//        System.out.println(JSON.toJSONString(userFrom));
//        UserFrom userFrom = new UserFrom(1, "1", true);
        UserTo userTo = UserConverter.INSTANCE.convertFrom2To(userFrom);
//        UserTo userTo = TestUserConverter.INSTANCE.convertSource2Target(userFrom);
//        System.out.println(JSON.toJSONString(userFrom));
        System.out.println(JSON.toJSONString(userTo));
//
//        UserFrom userFrom2 = TestUserConverter.INSTANCE.convertTarget2Source(userTo);
//        System.out.println(JSON.toJSONString(userFrom2));
//
//        userTo.setId(null);
//        UserFrom userFrom1 = TestUserConverter.INSTANCE.convertTarget2Source(userTo);
//        System.out.println(JSON.toJSONString(userFrom1));
//
//        List<UserFrom> userFromList = Lists.newArrayList(userFrom);
//        List<UserTo> userToList = TestUserConverter.INSTANCE.convertSourceList2TargetList(userFromList);
//        System.out.println(JSON.toJSONString(userToList));
//
//        String diff = "{\"id\":61,\"contract_id\":10052,\"favourable\":0,\"deposit\":30000000,\"material_standard\":\"[{\\\"quarterValue\\\":1,\\\"configFee\\\":1.0},{\\\"quarterValue\\\":2,\\\"configFee\\\":1.0},{\\\"quarterValue\\\":3,\\\"configFee\\\":1.0},{\\\"quarterValue\\\":4,\\\"configFee\\\":1.0},{\\\"quarterValue\\\":5,\\\"configFee\\\":1.0},{\\\"quarterValue\\\":6,\\\"configFee\\\":1.0},{\\\"quarterValue\\\":7,\\\"configFee\\\":1.0},{\\\"quarterValue\\\":8,\\\"configFee\\\":1.0}]\",\"city_level\":\"G1\",\"subsidized\":0,\"settle_rules\":\"[{\\\"type\\\":1,\\\"rules\\\":[{\\\"startValue\\\":0,\\\"endValue\\\":101,\\\"rate\\\":\\\"2\\\",\\\"isOver\\\":false}]}]\",\"exemption_flag\":1,\"exemption_deadline\":1593014400,\"bidding_assessment_flag\":0,\"assessment_time_type\":1,\"start_time\":0,\"end_time\":0,\"day_gtv\":0.0,\"assessment_indicators\":\"\",\"effective\":1,\"status\":\"EFFECT\",\"ctime\":1592727708,\"utime\":1592727778,\"valid\":1}";
//        JSONObject jsonObject = JSON.parseObject(diff);
//        System.out.println(JSON.toJSONString(jsonObject));

//        Set<Integer> se1 = Sets.newHashSet(1);
//        Set<Integer> se2 = Sets.newHashSet(1);
//        Set<Integer> union = Sets.union(se1, se2);
//        System.out.println(JSON.toJSONString(union));
//
//        System.out.println(Sets.difference(union, Sets.newHashSet(1)));
    }

    public static void set(UserFrom userFrom) {
        userFrom = new UserFrom(2, "2", true, TypeEnum.TYPE_A);
    }
}
