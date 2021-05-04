package com.z.kmodule.mockito.powermock.mock;

import lombok.Data;

@Data
public class Rectangle {

    private double width;
    private double height;

    public double getArea() {
        return width * height;
    }
}
