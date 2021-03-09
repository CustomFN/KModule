package com.z.kmodule.stream.demo03;

public class ObTest {

    public static void main(String[] args) {
        Ob1 ob1 = new Ob1();
        System.out.println(ob1);
        doSet(ob1);
        System.out.println(ob1);
    }

    public static void doSet(Ob1 ob1) {
        Ob2 ob2 = ob1.getOb2();
        ob2.setAge(1);
    }
}
