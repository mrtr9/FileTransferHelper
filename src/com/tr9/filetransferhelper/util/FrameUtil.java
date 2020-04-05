package com.tr9.filetransferhelper.util;

import javax.swing.*;

public class FrameUtil {

    public static JScrollPane getJScrollPane(int x,int y,int width,int height){
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setBounds(x,y,width,height);
        return jScrollPane;
    }

    public static JLabel getJLabel(int x,int y,int width,int height,String text,Icon icon){
        JLabel label = new JLabel(text);
        label.setBounds(x,y,width,height);
        label.setIcon(icon);
        label.setFont(FontUtil.getMircosoftYaHeiBoldFont(16));
        return label;
    }

    public static JButton getJButton(int x,int y,int width,int height,String text,Icon icon){
        JButton button = new JButton(text);
        button.setBounds(x,y,width,height);
        button.setIcon(icon);
        button.setFont(FontUtil.getMircosoftYaHeiBoldFont(16));
        return button;
    }

    public static JPanel getJPanel(int x,int y,int width,int height){
        JPanel panel = new JPanel();
        panel.setBounds(x,y,width,height);
        return panel;
    }
}
