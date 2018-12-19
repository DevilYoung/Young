package com.xiaola.demo.multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

/**
 * Created by xiaola on 18/12/17.
 */
public class MultiCastClient {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress group = InetAddress.getByName("224.6.7.8");
        try{
            MulticastSocket socket = new MulticastSocket(8888);
            socket.joinGroup(group);
            byte[] buf = new byte[256];
            while(true){
                DatagramPacket msgPacket = new DatagramPacket(buf,buf.length);
                socket.receive(msgPacket);

                String msg = new String(msgPacket.getData());
                System.out.println("客户端接收:" + msg);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
