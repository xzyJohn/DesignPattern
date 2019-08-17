package com.xzy.structuralpattern.commandpattern;

/**
 * 执行具体的命令，遥控器
 * @author xzy
 * @date 2019/8/17 14:28
 */
public class Control {
    private Command commandOn,commandOff,commandChange;
    public Control(Command on,Command off,Command change){
        commandOn=on;
        commandOff=off;
        commandChange=change;
    }

    public void turnOn(){
        commandOn.execute();
    }

    public void turnOff(){
        commandOff.execute();
    }

    public void changeChannel(){
        commandChange.execute();
    }
}
