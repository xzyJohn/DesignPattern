package com.xzy.behavioralpattern.adapterpattern.classadapter;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/15 14:22
 */
public class Main {
    public static void main(String[] args){

         //使用普通功能类
        Target concreteTarget=new ConcreteTarget();
        concreteTarget.request();


         //使用特殊功能类，即适配类
        Target adapter=new Adapter();
        adapter.request();

    }
}
