package com.z.kmodule.mockito.demo01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestInjectMock {

    @Mock
    UserDao userDao;

    @InjectMocks
    UserService userService;


    @Test
    public void testInjectMock() {
        System.out.println(userDao.getClass());
        System.out.println(11111);
        System.out.println(22222);
        System.out.println(userService.doDao().getClass());
    }

}
