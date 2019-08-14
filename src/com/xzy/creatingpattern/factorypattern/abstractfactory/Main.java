package com.xzy.creatingpattern.factorypattern.abstractfactory;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/14 14:39
 */
public class Main {
    public static void main(String[] args){
        MakeComputer makeComputer=new MakeComputer();
        AbstractFactory abstractFactory=new AmdFactory();
        makeComputer.makeComputer(abstractFactory);
    }
}
