package com.z.kmodule.controller.demo01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test2")
@Controller
public class TestController_2 extends TestController {

    @Override
    @ResponseBody
    public String req() {
        System.out.println("TestController_2");
        return "TestController_2";
    }
}
