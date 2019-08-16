package com.xzy.behavioralpattern.decoratorpattern;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/16 14:18
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Person();
        Decorator decorator = new DecoratorThree(new DecoratorTwo(new DecoratorOne(human)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
