package com.lfq.xc.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springdemo02 {
    @Test
            public void demo03() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("Bean1");
    }
    public  void  demo04(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    /*public  void  demo05(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }*/

}
