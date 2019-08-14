package com.xzy.creatingpattern.factorypattern.factory;

/**
 * 生产中国食物B
 * @author xzy
 * @date 2019/8/14 14:07
 */
public class ChineseFoodB implements Food {
    @Override
    public void makeFood() {
        System.out.println("生产了中国食物B");
    }
}
