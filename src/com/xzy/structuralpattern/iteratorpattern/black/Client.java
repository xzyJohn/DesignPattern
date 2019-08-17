package com.xzy.structuralpattern.iteratorpattern.black;

/**
 * 客户端类
 *
 * @author xzy
 * @date 2019/8/17 15:42
 */
public class Client {
    public void operation(){
        Object[] objArray = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth"};
        Aggregate aggregate = new ConcreteAggregate(objArray);
        Iterator iterator=aggregate.createIterator();
        while(!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }

}
