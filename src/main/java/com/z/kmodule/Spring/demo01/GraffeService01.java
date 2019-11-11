package com.z.kmodule.Spring.demo01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class GraffeService01{

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("invoke DisposableBean#destroy");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("invoke InitializingBean#afterPropertiesSet");

    }

    public void say() {
        System.out.println("invoke GraffeService01#say");
    }
}
