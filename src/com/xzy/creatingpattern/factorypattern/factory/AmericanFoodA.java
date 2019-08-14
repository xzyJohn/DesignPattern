package com.xzy.creatingpattern.factorypattern.factory;

/**
 * 生产美国食物A
 * @author xzy
 * @date 2019/8/14 14:07
 */
public class AmericanFoodA implements Food {
    @Override
    public void makeFood() {
        System.out.println("生产了美国食物A");
    }
}
