package com.xzy.creatingpattern.factorypattern.factory;

/**
 * 生产中国食物A
 * @author xzy
 * @date 2019/8/14 14:06
 */
public class ChineseFoodA implements Food {
    @Override
    public void makeFood() {
        System.out.println("生产了中国食物A");
    }
}
