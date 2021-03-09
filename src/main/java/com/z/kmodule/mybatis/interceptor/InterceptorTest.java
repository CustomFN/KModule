package com.z.kmodule.mybatis.interceptor;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.z.kmodule.mybatis.domain.User;
import com.z.kmodule.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InterceptorTest {

    @Autowired
    UserMapper userMapper;


    @Test
    public void test() {
        User user = new User();
        user.setName("1");
        user.setAge(1);
        userMapper.insert(user);
    }

    @Test
    public void testSelect() {
        PageHelper.startPage(1, 10);
//        List<User> userList = userMapper.selectById(1);
//        System.out.println("=== " + JSON.toJSONString(userList));

        List<String> stringList = userMapper.selectNameById(1);
        System.out.println("== " + JSON.toJSONString(stringList));
    }
}
