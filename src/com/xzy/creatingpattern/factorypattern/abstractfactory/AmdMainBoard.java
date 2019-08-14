package com.xzy.creatingpattern.factorypattern.abstractfactory;

/**
 * @author xzy
 * @date 2019/8/14 14:37
 */
public class AmdMainBoard implements MainBoard {
    @Override
    public void makeMainBoard() {
        System.out.println("生产了Amd的主板");
    }
}
