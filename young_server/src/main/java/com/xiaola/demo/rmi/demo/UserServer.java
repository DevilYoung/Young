package com.xiaola.demo.rmi.demo;

/**
 * Created by xiaola on 18/12/19.
 */
public class UserServer extends  User {
    public static void main(String[] args) {
        UserServer userServer = new UserServer();
        userServer.setAge(19);

        User_Skeleton skel = new User_Skeleton(userServer);
        skel.start();

    }
}
