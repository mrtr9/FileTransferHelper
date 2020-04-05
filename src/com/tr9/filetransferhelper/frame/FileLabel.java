package com.tr9.filetransferhelper.frame;

import com.tr9.filetransferhelper.util.FileUtil;
import com.tr9.filetransferhelper.util.FrameUtil;

import javax.swing.*;
import java.io.File;

public class FileLabel extends JLabel {

    private int WIDTH = 500;
    private int HEIGHT = 60;

    ImageIcon deleteIcon = new ImageIcon("com/tr9/filetransferhelper/icon/delete.png");

    public FileLabel(File file, int fileIndex){
        this.setSize(WIDTH,HEIGHT);
        this.setLayout(null);
        this.setOpaque(true);
        this.setBorder(BorderFactory.createEtchedBorder());
        Icon fileIcon = FileUtil.getIconFromFile(file);
        JLabel IconLabel = FrameUtil.getJLabel(0,0,60,60,null,fileIcon);
        JLabel fileNameLabel = FrameUtil.getJLabel(65,0,200,60,file.getName(),null);
        JLabel fileSizeLabel = FrameUtil.getJLabel(0,80,100,60,FileUtil.getFileSize(file),null);
        JButton deleteButton = FrameUtil.getJButton(50,0,50,60,null ,deleteIcon);
        this.add(IconLabel);
        this.add(deleteButton);
        this.add(fileNameLabel);
        this.add(fileSizeLabel);
    }
}
