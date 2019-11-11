package com.z.kmodule.lambda.demo01;

import org.springframework.core.convert.converter.Converter;

public class TestLambda01 {

    public static void main(String[] args) {
//        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Converter<String, Integer> converter = Integer::valueOf;
        Integer value = converter.convert("111");
        System.out.println(value.getClass());
    }
}
