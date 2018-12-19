package com.xiaola.demo.rmi.demo;

import java.io.IOException;

/**
 * Created by xiaola on 18/12/19.
 */
public class User {
    private int age;

    public int getAge() throws IOException {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
