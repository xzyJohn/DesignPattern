package com.xzy.creatingpattern.factorypattern.abstractfactory;

/**
 * Amd的工厂
 * @author xzy
 * @date 2019/8/14 14:33
 */
public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard();
    }
}
