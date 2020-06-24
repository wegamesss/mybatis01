package com.lfq.xc.demo2;

public class Bean2Factory {


    public static Bean2 Bean2create() {
        System.err.println("Bean2create被执行");
        return new Bean2();
    }

    public String createBean3() {
        return null;
    }
}
