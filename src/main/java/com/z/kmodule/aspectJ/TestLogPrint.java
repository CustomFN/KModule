package com.z.kmodule.aspectJ;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@EnableAspectJAutoProxy
public class TestLogPrint {

    @Test
    public void testtt() {
        String outputStr = "hello world";
        int output = doOutput(outputStr);
        System.out.println(output);
    }

    @LogPrint
    public int doOutput(String outputStr) {
        System.out.println(outputStr);
        return 100;
    }
}
