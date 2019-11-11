package com.z.kmodule.mockito.demo01;

public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao) {
        System.out.println("UserService Constructor");
        this.userDao = userDao;
    }

    public UserDao doDao() {
        return userDao;
    }
}
