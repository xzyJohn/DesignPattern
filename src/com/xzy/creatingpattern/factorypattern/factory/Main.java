package com.xzy.creatingpattern.factorypattern.factory;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/14 14:11
 */
public class Main {
    public static void main(String[] args){
        FoodFactory foodFactory=new ChineseFoodFactory();
        Food food=foodFactory.makeFood("A");
        food.makeFood();
    }
}
