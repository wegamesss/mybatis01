package com.lfq.xc;

import lombok.Data;

@Data
public class UserServicelmpl implements UserService{
    private String name;
    @Override
    public void helloworld() {
        System.err.println("hello world"+name);
    }
}
