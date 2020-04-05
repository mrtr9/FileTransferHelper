package com.tr9.filetransferhelper.net;

import java.io.IOException;
import java.net.ServerSocket;

public class NetMain implements Runnable {

    @Override
    public void run() {
        buildSocket();
    }

    private void buildSocket(){
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
