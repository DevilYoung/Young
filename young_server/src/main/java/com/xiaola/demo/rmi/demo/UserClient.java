package com.xiaola.demo.rmi.demo;

import java.io.IOException;

/**
 * Created by xiaola on 18/12/19.
 */
public class UserClient {
    public static void main(String[] args) throws IOException {
        User user = new User_Stub();
        int age = user.getAge();

        System.out.print(age);

    }
}
