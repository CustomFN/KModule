package com.z.kmodule.aspectJ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    @LogPrint
    public String hello(@RequestParam("name") String name, @RequestParam(value = "age", required = false) Integer age) {
        User user = new User(name, age);
//        return helloService.doSay(name, age);
        return helloService.doSay(user);
    }
}
