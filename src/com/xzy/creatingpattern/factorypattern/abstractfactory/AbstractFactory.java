package com.xzy.creatingpattern.factorypattern.abstractfactory;

/**
 * 抽象工厂
 * @author xzy
 * @date 2019/8/14 14:26
 */
public interface AbstractFactory {
    /**
     * 创建cpu对象
     *
     * @return cpu对象
     */
    public Cpu createCpu();

    /**
     * 生产主板
     *
     * @return 主板对象
     */
    public MainBoard createMainBoard();
}
