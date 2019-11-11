package com.z.kmodule.spi.demo01;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SpiTest {

    public static void main(String[] args) {
        ServiceLoader<Animal> load = ServiceLoader.load(Animal.class);
        Iterator<Animal> iterator = load.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            animal.eat();
        }
    }
}
