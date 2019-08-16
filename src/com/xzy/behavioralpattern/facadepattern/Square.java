package com.xzy.behavioralpattern.facadepattern;

/**
 * 图形实现类，画正方形
 * @author xzy
 * @date 2019/8/16 15:08
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
