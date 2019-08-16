package com.xzy.behavioralpattern.facadepattern;

/**
 * 图形实现类，画矩形
 * @author xzy
 * @date 2019/8/16 15:07
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
