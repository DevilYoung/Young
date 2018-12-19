package com.xiaola.demo.serialize;

import java.io.Serializable;

/**
 * Created by xiaola on 18/12/17.
 */
public class Person  implements Serializable{

    private static final long serialVersionUID = 177876383054656981L;

    public  static int height = 2;

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
