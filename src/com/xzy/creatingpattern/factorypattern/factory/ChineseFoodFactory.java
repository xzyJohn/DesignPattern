package com.xzy.creatingpattern.factorypattern.factory;

/**
 * 生产中国食物的工厂
 *
 * @author xzy
 * @date 2019/8/14 14:03
 */
public class ChineseFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        String aFood = "A";
        String bFood = "B";
        if (aFood.equals(name)) {
            return new ChineseFoodA();
        } else if (bFood.equals(name)) {
            return new ChineseFoodB();
        } else {
            return null;
        }

    }
}
