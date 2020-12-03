package com.ccgg.beans;

import lombok.Data;

@Data
public class Wrapper {
    private User user;
    private Person p;

    public Wrapper() {
    }

    public Wrapper(User user) {
        super();
    }

    public Wrapper(User user, Person p) {
        super();
        this.user = user;
        this.p = p;
    }
}
