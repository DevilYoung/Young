package com.xiaola.demo.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by xiaola on 18/12/19.
 */
public class SayHelloImpl  extends UnicastRemoteObject implements ISayHello {

    public SayHelloImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello " + name;
    }
}
