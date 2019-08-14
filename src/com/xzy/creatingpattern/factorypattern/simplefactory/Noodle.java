package com.xzy.creatingpattern.factorypattern.simplefactory;

/**
 * 生产面条
 * @author xzy
 * @date 2019/8/14 13:17
 */
public class Noodle implements Food {

    public Noodle() {
    }

    @Override
    public void makeFood() {
        System.out.println("生产了面条");
    }
}
