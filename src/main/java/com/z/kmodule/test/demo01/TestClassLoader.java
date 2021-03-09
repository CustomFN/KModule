package com.z.kmodule.test.demo01;

import java.lang.management.ManagementFactory;

public class TestClassLoader {

    public static void main(String[] args) {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        String s = name.split("@")[0];

        System.out.println("pid:" + s);
        while (true) {
            try {
                Thread.sleep(5000L);
            } catch (Exception e) {
                break;
            }
            code();
        }
    }

    public static void code() {
        System.out.println("I love code");
    }
}
