package com.z.kmodule.mockito.powermock.mock;

import lombok.Data;

@Data
public final class Circle {

    private double radius;
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
