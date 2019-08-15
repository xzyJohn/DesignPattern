package com.xzy.behavioralpattern.adapterpattern.classadapter;

/**
 * 适配器，继承了被适配的类
 * 同时，实现了标准接口
 * @author xzy
 * @date 2019/8/15 14:21
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
