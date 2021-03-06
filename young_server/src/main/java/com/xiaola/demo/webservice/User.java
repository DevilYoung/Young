package com.xiaola.demo.webservice;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by xiaola on 18/12/19.
 */
@XmlRootElement
public class User {
    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
