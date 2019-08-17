package com.xzy.structuralpattern.iteratorpattern.black;

/**
 * @author xzy
 * @date 2019/8/17 15:28
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     * @return 迭代子
     */
    public abstract Iterator createIterator();
}
