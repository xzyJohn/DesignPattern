package com.xzy.creatingpattern.prototypepattern;

/**
 * 原型模式
 * 实现Cloneable接口，重写Object类的clone方法
 * @author xzy
 * @date 2019/8/14 17:41
 */
public class Prototype implements Cloneable {
    @Override
    public Prototype clone(){
        Prototype prototype=null;
        try {
            prototype= (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
