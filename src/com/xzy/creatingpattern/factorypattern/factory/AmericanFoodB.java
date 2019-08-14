package com.xzy.creatingpattern.factorypattern.factory;

/**
 * @author xzy
 * @date 2019/8/14 14:08
 */
public class AmericanFoodB implements Food {
    @Override
    public void makeFood() {
        System.out.println("生产了美国食物B");
    }
}
