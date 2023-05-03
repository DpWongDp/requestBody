package com.dp.requestbody.model;

import lombok.Data;

@Data
public class User {
    private String name;
    private int age;
    private String remark;

    public User(String name, int age, String remark) {
        this.name = name;
        this.age = age;
        this.remark = remark;
    }
}
