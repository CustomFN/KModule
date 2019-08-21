package com.z.kmodule.dubbo.demo01;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
