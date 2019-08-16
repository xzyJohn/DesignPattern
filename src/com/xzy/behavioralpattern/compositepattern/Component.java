package com.xzy.behavioralpattern.compositepattern;

/**
 * @author xzy
 * @date 2019/8/15 16:40
 */
public abstract class Component {
    String name;

    /**
     * 添加
     *
     * @param component 对象实例
     */
    public abstract void add(Component component);

    /**
     * 删除
     *
     * @param component 对象实例
     */
    public abstract void remove(Component component);

    /**
     * 遍历子节点
     */
    public abstract void eachChild();
}
