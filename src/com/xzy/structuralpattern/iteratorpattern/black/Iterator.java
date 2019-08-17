package com.xzy.structuralpattern.iteratorpattern.black;

/**
 * 抽象迭代子角色类
 * @author xzy
 * @date 2019/8/17 15:09
 */
public interface Iterator {
    /**
     * 迭代方法，移动到第一个元素
     */
    public void first();

    /**
     * 迭代方法，移动到下一个元素
     */
    public void next();

    /**
     * 迭代方法，判断是否为最后一个元素
     * @return 结果
     */
    public boolean isDone();

    /**
     * 迭代方法，返回当前元素
     * @return 当前元素
     */
    public Object currentItem();
}
