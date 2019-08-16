package com.xzy.behavioralpattern.proxypattern;

/**
 * 制作鸡肉
 * @author xzy
 * @date 2019/8/16 16:10
 */
public class Chicken implements Food {
    @Override
    public void makeFood() {
        System.out.println("制作鸡肉");
    }
}
