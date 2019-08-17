package com.xzy.structuralpattern.commandpattern;

/**
 * 打开电视机的命令
 * @author xzy
 * @date 2019/8/17 14:23
 */
public class CommandOn implements Command {
    private Tv myTv;

    public CommandOn(Tv tv){
        myTv=tv;
    }
    @Override
    public void execute() {
        myTv.turnOn();
    }
}
