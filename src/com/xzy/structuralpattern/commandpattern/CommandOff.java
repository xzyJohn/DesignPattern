package com.xzy.structuralpattern.commandpattern;

/**
 * 关闭电视机的命令
 * @author xzy
 * @date 2019/8/17 14:25
 */
public class CommandOff implements Command {
    private Tv myTv;
    public CommandOff(Tv tv){
        myTv=tv;
    }
    @Override
    public void execute() {
        myTv.turnOff();
    }
}
