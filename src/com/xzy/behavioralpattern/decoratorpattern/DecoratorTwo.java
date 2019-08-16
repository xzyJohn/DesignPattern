package com.xzy.behavioralpattern.decoratorpattern;

/**
 * 第二次装饰
 * @author xzy
 * @date 2019/8/16 14:04
 */
public class DecoratorTwo extends Decorator {
    public DecoratorTwo(Human human) {
        super(human);
    }

    public void goClothesPress(){
        System.out.println("去衣柜找找");
    }

    public void findPlaceOnMap(){
        System.out.println("在地图上找找");
    }

    @Override
    public void wearClothes(){
        super.wearClothes();
        goClothesPress();
    }

    @Override
    public void walkToWhere(){
        super.walkToWhere();
        findPlaceOnMap();
    }
}
