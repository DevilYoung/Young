package com.xiaola.demo.rmi.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by xiaola on 18/12/19.
 */
public class User_Stub extends  User {
    private Socket socket;

    public User_Stub() throws IOException{
        socket = new Socket("localhost",8888);
    }

    public int getAge() throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

        outputStream.writeObject("age");
        outputStream.flush();

        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        return inputStream.readInt();

    }
}
