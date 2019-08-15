package com.xzy.behavioralpattern.adapterpattern.objectadapter;

/**
 * 适配器类，直接关联被适配类
 * 同时，实现标准接口
 *
 * @author xzy
 * @date 2019/8/15 14:39
 */
public class Adapter implements Target {
    /**
     * 关联被适配的类
     */
    private Adaptee adaptee;

    /**
     * 通过构造函数传入具体需要被适配的被适配类对象
     * @param adaptee 被适配类
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //使用委托的方式，完成特殊功能
        adaptee.specificRequest();
    }
}
