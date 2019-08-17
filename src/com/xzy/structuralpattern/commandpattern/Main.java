package com.xzy.structuralpattern.commandpattern;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/17 14:32
 */
public class Main {
    public static void main(String[] args){
        Tv myTv=new Tv();
        CommandOn commandOn=new CommandOn(myTv);
        CommandOff commandOff=new CommandOff(myTv);
        CommandChange commandChange=new CommandChange(myTv,2);
        Control control=new Control(commandOn,commandOff,commandChange);

        control.turnOn();
        control.changeChannel();
        control.turnOff();
    }
}
