package com.xzy.structuralpattern.iteratorpattern.white;

/**
 * 具体迭代子角色类
 * @author xzy
 * @date 2019/8/17 15:14
 */
public class ConcreteIterator implements Iterator {
    /**
     * 持有被迭代的具体的聚合对象
     */
    private ConcreteAggregate aggregate;
    /**
     * 内部索引，记录当前迭代到的索引位置
     */
    private int index = 0;

    /**
     * 记录当前索引对象的大小
     */

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.size = aggregate.size();
        index = 0;
    }

    private int size = 0;

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return (index >= size);
    }

    @Override
    public Object currentItem() {
        return aggregate.getElement(index);
    }
}
