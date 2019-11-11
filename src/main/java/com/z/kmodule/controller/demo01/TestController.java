package com.z.kmodule.controller.demo01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class TestController {

    @RequestMapping("/tt")
    @ResponseBody
    public String req() {
        System.out.println("TestController");
        return "TestController";
    }
}
