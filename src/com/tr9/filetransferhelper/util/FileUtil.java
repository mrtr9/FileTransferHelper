package com.tr9.filetransferhelper.util;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class FileUtil {

    public static Icon getIconFromFile(File file){
        if(file.exists()){
            return FileSystemView.getFileSystemView().getSystemIcon(file);
        }else{
            return null;
        }
    }

    public static String getFileSize(File file){
        if(file.exists()){
            try{
                FileInputStream fileInputStream = new FileInputStream(file);
                long size = fileInputStream.available();
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                if(size == 0){
                    return "0B";
                } else if(size < 1024){
                    return decimalFormat.format((double) size / 1024) + "KB";
                }else if(size < 1048576){
                    return decimalFormat.format((double) size / 1048576) + "MB";
                }else{
                    return decimalFormat.format((double) size / 1073741824) + "GB";
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return "unkown size";
    }
}
