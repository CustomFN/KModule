package com.z.kmodule.aspectJ;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @LogPrint
    public String doSay(String name, Integer age) {
        return "Hi, " + name + ", your age " + age;
    }

    @LogPrint
    public String doSay(User user) {
        return "Hi, " + JSON.toJSONString(user);
    }
}
