package com.z.kmodule.mockito.powermock.mockstatic;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(value = {StringUtils.class})
public class StringUtilsTest {

    @Test
    public void testIsEmpty() {
        String string = "abc";
        boolean expected = true;
        PowerMockito.mockStatic(StringUtils.class);
        PowerMockito.when(StringUtils.isEmpty(string)).thenReturn(expected);
        boolean actual = StringUtils.isEmpty(string);
        Assert.assertEquals("返回值不相等", expected, actual);
    }
}
