package com.xzy.behavioralpattern.decoratorpattern;

/**
 * 被装饰者
 * @author xzy
 * @date 2019/8/16 14:17
 */
public class Person implements Human {
    @Override
    public void wearClothes() {
        System.out.println("穿什么呢？");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里呢？");
    }
}
