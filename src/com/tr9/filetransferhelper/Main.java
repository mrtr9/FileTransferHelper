package com.tr9.filetransferhelper;

import com.tr9.filetransferhelper.frame.MainFrame;
import com.tr9.filetransferhelper.net.NetMain;

public class Main {

    public static void main(String[] args) {
        NetMain netMain = new NetMain();
        Thread thread = new Thread(netMain);
        thread.start();
        new MainFrame().setVisible(true);
    }
}
