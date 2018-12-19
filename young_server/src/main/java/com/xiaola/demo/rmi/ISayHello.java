package com.xiaola.demo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by xiaola on 18/12/19.
 */
public interface ISayHello extends Remote {

    String sayHello(String name) throws RemoteException;

}
