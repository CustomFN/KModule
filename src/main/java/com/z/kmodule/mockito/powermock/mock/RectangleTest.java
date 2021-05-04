package com.z.kmodule.mockito.powermock.mock;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

public class RectangleTest {

    @Test
    public void testGetArea() {
        double expectedArea = 100D;
        Rectangle rectangle = PowerMockito.mock(Rectangle.class);
        PowerMockito.when(rectangle.getArea()).thenReturn(expectedArea);
        double actualArea = rectangle.getArea();
        Assert.assertEquals("not equals", expectedArea, actualArea, 1E-6D);
    }
}
