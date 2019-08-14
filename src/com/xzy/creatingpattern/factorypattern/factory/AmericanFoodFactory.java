package com.xzy.creatingpattern.factorypattern.factory;

/**
 * 生产美国食物的工厂
 * @author xzy
 * @date 2019/8/14 14:10
 */
public class AmericanFoodFactory implements FoodFactory{
    @Override
    public Food makeFood(String name) {
        String aFood = "A";
        String bFood = "B";
        if (aFood.equals(name)) {
            return new AmericanFoodA();
        } else if (bFood.equals(name)) {
            return new AmericanFoodB();
        } else {
            return null;
        }
    }
}
