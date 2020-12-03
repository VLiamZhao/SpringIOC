package com.ccgg.beans;

import lombok.Data;

@Data
public class User {
    private String name;
    private int age;

    public User(){
        super();
    }

    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

}
