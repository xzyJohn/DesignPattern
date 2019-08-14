package com.xzy.creatingpattern.factorypattern.simplefactory;

/**
 * 简单工厂
 * @author xzy
 * @date 2019/8/14 13:43
 */
public class SimpleFactory {
    public static Food makeFood(String foodName) {
        String noodle = "noodle";
        String rice = "rice";
        if (noodle.equals(foodName)) {
            Food food = new Noodle();
            return food;
        } else if (rice.equals(foodName)) {
            Food food = new Rice();
            return food;
        } else {
            System.out.println("生产不出来！");
            return null;
        }
    }
}
