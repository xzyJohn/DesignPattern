package com.xzy.behavioralpattern.adapterpattern.objectadapter;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/15 14:44
 */
public class Main {
    public static void main(String[] args){
        //使用普通功能类
        Target concreteTarget =new ConcreteTarget();
        concreteTarget.request();

        /*
        使用特殊功能，即适配类
        需要先创建一个被适配类的对象作为参数
         */
        Target adapter=new Adapter(new Adaptee());
        adapter.request();
    }
}
