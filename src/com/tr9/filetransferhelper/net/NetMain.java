package com.tr9.filetransferhelper.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetMain implements Runnable {

    @Override
    public void run() {
        buildSocket();
    }

    private void buildSocket(){
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            String inetHostAddress = socket.getInetAddress().getHostAddress();
            String inetHostName = socket.getInetAddress().getHostName();
            String localHostAddress = socket.getLocalAddress().getHostAddress();
            String localHostName = socket.getLocalAddress().getHostName();
            System.out.println(inetHostAddress);
            System.out.println(inetHostName);
            System.out.println(localHostAddress);
            System.out.println(localHostName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
