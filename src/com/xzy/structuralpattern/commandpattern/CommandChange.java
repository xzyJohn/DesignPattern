package com.xzy.structuralpattern.commandpattern;

/**
 * 换台的命令
 * @author xzy
 * @date 2019/8/17 14:26
 */
public class CommandChange implements Command {
    private Tv myTv;
    private int channel;
    public CommandChange(Tv tv,int channel){
        myTv=tv;
        this.channel=channel;
    }
    @Override
    public void execute() {
        myTv.changeChannel(channel);
    }
}
