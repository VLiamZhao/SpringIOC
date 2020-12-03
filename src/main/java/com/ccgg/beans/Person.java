package com.ccgg.beans;

import lombok.Data;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        super();
    }

    public Person(String firstName, String lastName, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
