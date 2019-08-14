package com.xzy.creatingpattern.singletonpattern.hungrysingleton;

/**
 * 饿汉模式，在类初始化时，就已经自行实例化
 * 是线程安全的
 * @author xzy
 * @date 2019/8/14 15:32
 */
public class Singleton {
    private Singleton(){}
    private static final Singleton singleton=new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}
