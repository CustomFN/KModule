package com.z.kmodule.validate;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {

        TestVo testVo = new TestVo();
        testVo.setAge("-1");
        testVo.setEmail("11@com.com");
        Map<String, String> validate = ValidateUtil.validate(testVo);
        Collection<ImmutablePair<String,String>> co = new ArrayList<>();
        for (Map.Entry<String, String> itr : validate.entrySet()){
            co.add(ImmutablePair.of(itr.getKey(), itr.getValue()));
        }
        System.out.println(JSON.toJSONString(co));
    }
}
