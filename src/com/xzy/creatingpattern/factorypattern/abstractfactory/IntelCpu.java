package com.xzy.creatingpattern.factorypattern.abstractfactory;

/**
 * 生产Intel的Cpu
 * @author xzy
 * @date 2019/8/14 14:35
 */
public class IntelCpu implements Cpu {
    @Override
    public void makeCpu() {
        System.out.println("生产了intel的cpu");
    }
}
