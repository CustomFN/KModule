package com.z.kmodule.learn.iocaop.Demo01;

public class SimpleIocTest {

    public static void main(String[] args) throws Exception {
        String location = SimpleIocTest.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIoc simpleIoc = new SimpleIoc(location);
        Wheel wheel = (Wheel) simpleIoc.getBean("wheel");
        System.out.println(wheel);

        Car car = (Car) simpleIoc.getBean("car");
        System.out.println(car);
    }
}
