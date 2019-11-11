package com.z.kmodule.Spring.demo01;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private GraffeService graffeService;

    @Autowired
    private GraffeService01 graffeService01;

    @org.junit.Test
    public void tt() {
//        graffeService.say();
        graffeService01.say();
    }
}
