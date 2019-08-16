package com.xzy.behavioralpattern.flyweightpattern;

/**
 * 享元模式的调用
 * @author xzy
 * @date 2019/8/16 15:41
 */
public class FlyWeightPattern {
    FlyWeightFactory factory=new FlyWeightFactory();
    FlyWeight fly1;
    FlyWeight fly2;
    FlyWeight fly3;
    FlyWeight fly4;
    FlyWeight fly5;
    FlyWeight fly6;

    public FlyWeightPattern(){
        fly1=factory.getFlyWeight("Google");
        fly2=factory.getFlyWeight("Bing");
        fly3=factory.getFlyWeight("Google");
        fly4=factory.getFlyWeight("Google");
        fly5=factory.getFlyWeight("Google");
        fly6=factory.getFlyWeight("Google");
    }

    public void showFlyWeight(){
        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();
        fly5.operation();
        fly6.operation();
        int objectSize=factory.getFlyWeightSize();
        System.out.println("objectSize="+objectSize);
    }
}
