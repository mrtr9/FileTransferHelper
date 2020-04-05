package com.tr9.filetransferhelper.frame;

import com.tr9.filetransferhelper.util.FrameUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainFrame extends JFrame {

    protected static File[] files;
    private ImageIcon computerIcon = new ImageIcon("src/com/tr9/filetransferhelper/icon/computer.png");
    private ImageIcon fileIcon = new ImageIcon("src/com/tr9/filetransferhelper/icon/file.png");
    private ImageIcon sendIcon = new ImageIcon("src/com/tr9/filetransferhelper/icon/send.png");
    private ImageIcon hintIcon = new ImageIcon("src/com/tr9/filetransferhelper/icon/hint.png");

    static JScrollPane hostScrollPane = FrameUtil.getJScrollPane(0, 0, 500, 600);
    JButton fileButton = FrameUtil.getJButton(520, 0, 200, 70, "Choose File", fileIcon);
    JButton sendButton = FrameUtil.getJButton(820, 0, 150, 70, "Send File", sendIcon);
    JLabel selectedFileLabel = FrameUtil.getJLabel(500,70,100,30,"Selected File :",null);
    static JScrollPane fileScrollPane = FrameUtil.getJScrollPane(500,100,500,430);
    JLabel hintLabel = FrameUtil.getJLabel(500,520,500,60,"please choose file and host first.file and host can be multi selected",hintIcon);
    JFileChooser fileChooser = new JFileChooser();

    public MainFrame() {
        this.setSize(1000, 600);
        this.setTitle("File Transfer Helper design by Tr9");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(Boolean.FALSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        hostScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        fileScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        fileChooser.setMultiSelectionEnabled(true);
        fileButton.setBackground(Color.LIGHT_GRAY);
        fileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int mark = fileChooser.showOpenDialog(fileButton);
                if(mark == 0){
                    files = fileChooser.getSelectedFiles();
                    fillFileScrollPane(files);
                }
            }
        });
        sendButton.setBackground(Color.LIGHT_GRAY);
        this.add(hostScrollPane);
        this.add(fileButton);
        this.add(sendButton);
        this.add(selectedFileLabel);
        this.add(fileScrollPane);
        this.add(hintLabel);


    }

    protected static void fillFileScrollPane(File[] files) {
//        fileScrollPane.removeAll();
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        int i = 0;
        for(File file : files){
            FileLabel fileLabel = new FileLabel(file,i);
            panel.add(fileLabel);
            i++;
        }
        fileScrollPane.setViewportView(panel);
    }
}
