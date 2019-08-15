package com.xzy.behavioralpattern.adapterpattern.objectadapter;

/**
 * 已存在的，具有特殊功能的类，但不符合我们既有的标准接口的类
 * @author xzy
 * @date 2019/8/15 11:24
 */
public class Adaptee {
    public void specificRequest(){
        System.out.println("被适配类 具有特殊功能");
    }
}
