package com.z.kmodule.concurrent.demo01;

public class TestSynchronized {

    public void test() {
        synchronized (this) {
            System.out.println("Hello World!");
        }
    }
}
