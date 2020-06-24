package com.lfq.xc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class springdemo01 {
    @Test
    public void demo01() {
        UserService userservice =new UserServicelmpl();
        userservice.helloworld();
    }
    @Test
    public void demo02(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userservice = (UserService) applicationContext.getBean("userService");
        userservice.helloworld();

    }
}
