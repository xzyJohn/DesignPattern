package com.xzy.creatingpattern.factorypattern.abstractfactory;

/**
 * 生产Amd的Cpu
 * @author xzy
 * @date 2019/8/14 14:36
 */
public class AmdCpu implements Cpu {
    @Override
    public void makeCpu() {
        System.out.println("生产了Amd的cpu");
    }
}
