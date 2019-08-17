package com.xzy.structuralpattern.iteratorpattern.white;


/**
 * 工厂方法，创建相应迭代子对象接口
 * @author xzy
 * @date 2019/8/17 14:57
 */
public abstract class Aggregate {
    public abstract Iterator createIterator();

}
