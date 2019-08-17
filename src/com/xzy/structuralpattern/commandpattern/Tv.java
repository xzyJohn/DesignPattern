package com.xzy.structuralpattern.commandpattern;

/**
 * 命令接收者，电视机
 *
 * @author xzy
 * @date 2019/8/17 14:20
 */
public class Tv {
    public int currentChannel = 0;

    public void turnOn() {
        System.out.println("打开电视机");
    }

    public void turnOff() {
        System.out.println("关闭电视机");
    }

    public void changeChannel(int channel) {
        this.currentChannel = channel;
        System.out.println("现在频道为：" + channel);
    }
}
