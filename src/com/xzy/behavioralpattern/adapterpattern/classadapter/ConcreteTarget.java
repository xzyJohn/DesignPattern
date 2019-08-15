package com.xzy.behavioralpattern.adapterpattern.classadapter;

/**
 * 具体目标类，提供普通功能
 * @author xzy
 * @date 2019/8/15 14:19
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通类 具有普通功能");
    }
}
