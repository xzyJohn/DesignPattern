package com.xzy.creatingpattern.factorypattern.abstractfactory;

/**
 * Intel的工厂
 * @author xzy
 * @date 2019/8/14 14:32
 */
public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard();
    }
}
