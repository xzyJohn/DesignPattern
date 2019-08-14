package com.xzy.creatingpattern.factorypattern.abstractfactory;

/**
 * 生产电脑
 * 组装主板和Cpu
 * @author xzy
 * @date 2019/8/14 14:41
 */
public class MakeComputer {
    private Cpu cpu=null;
    private MainBoard mainBoard=null;

    public void makeComputer(AbstractFactory abstractFactory){
        this.cpu=abstractFactory.createCpu();
        this.mainBoard=abstractFactory.createMainBoard();
        cpu.makeCpu();
        mainBoard.makeMainBoard();
    }
}
