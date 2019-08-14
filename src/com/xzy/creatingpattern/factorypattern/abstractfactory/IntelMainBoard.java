package com.xzy.creatingpattern.factorypattern.abstractfactory;

/**
 * @author xzy
 * @date 2019/8/14 14:35
 */
public class IntelMainBoard implements MainBoard{
    @Override
    public void makeMainBoard() {
        System.out.println("生产了intel的主板");
    }
}
