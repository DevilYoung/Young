package com.xiaola.demo.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by xiaola on 18/12/12.
 */
public class SocketServer {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8888);
            while (true){
                Socket socket = serverSocket.accept();
                new Thread(()->{
                    try{
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        //发送数据
                        PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                        while(true){
                            String clientData = reader.readLine();
                            if(clientData == null){
                                break;
                            }

                            System.out.println("服务端接受数据:" + clientData);
                            writer.println("hello 陈丽娜");
                            writer.flush();
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }

                ).start();
            }


        } catch (Exception e){

        }finally {
            if(serverSocket !=null){
                serverSocket.close();
            }
        }

    }
}
