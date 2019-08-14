package com.xzy.creatingpattern.factorypattern.factory;

/**
 * 食物工厂
 * @author xzy
 * @date 2019/8/14 13:57
 */
public interface FoodFactory {
    /**
     * 生产食物
     * @param name 需要生产的食物的名字
     * @return 食物
     */
    Food makeFood(String name);
}
