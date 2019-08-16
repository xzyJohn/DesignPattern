package com.xzy.behavioralpattern.decoratorpattern;

/**
 * 第三次装饰
 * @author xzy
 * @date 2019/8/16 14:10
 */
public class DecoratorThree extends Decorator {
    public DecoratorThree(Human human) {
        super(human);
    }

    public void findClothes(){
        System.out.println("找到一件优衣库");
    }

    public void findTheTarget(){
        System.out.println("在地图上找到了宝藏");
    }

    @Override
    public void wearClothes(){
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere(){
        super.walkToWhere();
        findTheTarget();
    }
}
