package com.tr9.filetransferhelper.bean;

public class OnlineComputor {

    private String ip;
    private String hostName;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        return "OnlineComputor{" +
                "ip='" + ip + '\'' +
                ", hostName='" + hostName + '\'' +
                '}';
    }
}
