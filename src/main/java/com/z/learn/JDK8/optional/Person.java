package com.z.learn.JDK8.optional;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Car Car;

    public com.z.learn.JDK8.optional.Car getCar() {
        return Car;
    }

    public void setCar(com.z.learn.JDK8.optional.Car car) {
        Car = car;
    }
}
