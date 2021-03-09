package com.z.kmodule.jdk.map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.z.kmodule.mybatis.domain.User;
import org.assertj.core.util.Lists;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class HashMapTest {

    public static void main(String[] args) throws ParseException {
//        Map<String, String> map1 = new HashMap<>(2, 2);
//        Map<String, String> map2 = new HashMap<>();
//
//        System.out.println(map1.size());
//        map1.put("1", "1");
//        map1.put("2", "2");
//        map1.put("3", "3");
//        System.out.println(map1.size());
//
//        System.out.println(map2.size());
//        map2.put("1", "1");
//        map2.put("2", "2");
//        System.out.println(map2.);

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        Date parse = format.parse("2020-04-20");
//        System.out.println(parse.getTime() / 1000);
//
//        System.out.println(format.format(new Date(1587916799 * 1000L)));

//        List<Integer> list1 = Lists.newArrayList(1,2 ,3);
//        List<Integer> list2 = Lists.newArrayList(1,2 );
//        list1.retainAll(list2);
//        System.out.println(JSON.toJSONString(list1));
//
//        Map map = JSONObject.parseObject("{\"id\":8,\"contract_id\":41,\"favourable\":0,\"deposit\":40000000,\"material_standard\":\"[{\\\"quarterValue\\\":1,\\\"configFee\\\":1.0},{\\\"quarterValue\\\":2,\\\"configFee\\\":1.0},{\\\"quarterValue\\\":3,\\\"configFee\\\":2.0},{\\\"quarterValue\\\":4,\\\"configFee\\\":2.0},{\\\"quarterValue\\\":5,\\\"configFee\\\":0.0},{\\\"quarterValue\\\":6,\\\"configFee\\\":0.0},{\\\"quarterValue\\\":7,\\\"configFee\\\":0.0},{\\\"quarterValue\\\":8,\\\"configFee\\\":0.0}]\",\"city_level\":\"E2\",\"subsidized\":0,\"settle_rules\":\"[{\\\"rules\\\":[{\\\"endValue\\\":22200,\\\"rate\\\":\\\"4.25\\\",\\\"startValue\\\":0},{\\\"endValue\\\":55700,\\\"rate\\\":\\\"3.22\\\",\\\"startValue\\\":22200},{\\\"rate\\\":\\\"2.33\\\",\\\"startValue\\\":55700}],\\\"type\\\":1},{\\\"rules\\\":[{\\\"endValue\\\":12200,\\\"isOver\\\":false,\\\"rate\\\":\\\"0.09\\\",\\\"startValue\\\":0},{\\\"endValue\\\":21500,\\\"isOver\\\":false,\\\"rate\\\":\\\"1.99\\\",\\\"startValue\\\":12200},{\\\"endValue\\\":21600,\\\"isOver\\\":false,\\\"rate\\\":\\\"0.47\\\",\\\"startValue\\\":21500}],\\\"type\\\":2}]\",\"exemption_flag\":0,\"exemption_deadline\":0,\"bidding_assessment_flag\":0,\"assessment_time_type\":1,\"start_time\":0,\"end_time\":0,\"day_gtv\":0.0,\"assessment_indicators\":\"\",\"effective\":1,\"status\":\"EFFECT\",\"ctime\":1587113378,\"utime\":1587628759,\"valid\":1}", Map.class);
//        System.out.println(JSON.toJSONString(map));

        test();

    }

    public static void test() {
        boolean isSuccess = false;
        for(int i = 0; i < 10; i++) {
            if (i == 11) {
                isSuccess = true;
                System.out.println("yyy");
                return;
            }
        }
        if(!isSuccess) {
            System.out.println("xxx");
        }
    }
}
