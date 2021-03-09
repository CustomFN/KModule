package com.z.kmodule.guava.demo02;

import com.google.common.primitives.Ints;

public class TestInts {

    public static void main(String[] args) {
        String str = "";
        Integer integer = Ints.tryParse(str);
        System.out.println(integer);
    }
}
