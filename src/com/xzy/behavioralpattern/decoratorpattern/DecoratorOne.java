package com.xzy.behavioralpattern.decoratorpattern;

/**
 * 第一次装饰
 * @author xzy
 * @date 2019/8/16 14:00
 */
public class DecoratorOne extends Decorator {
    public DecoratorOne(Human human) {
        super(human);
    }

    public void goHome() {
        System.out.println("回家");
    }

    public void findMap() {
        System.out.println("找地图");
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }


    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }
}
