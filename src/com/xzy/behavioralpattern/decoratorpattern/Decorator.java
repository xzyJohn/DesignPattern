package com.xzy.behavioralpattern.decoratorpattern;

/**
 * 修饰者
 * @author xzy
 * @date 2019/8/16 13:58
 */
public abstract class Decorator implements Human {
    private Human human;

    public Decorator(Human human){
        this.human=human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
    }
}
