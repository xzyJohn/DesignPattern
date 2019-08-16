package com.xzy.behavioralpattern.facadepattern;

/**
 * 图形实现类，画圆
 * @author xzy
 * @date 2019/8/16 15:06
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
