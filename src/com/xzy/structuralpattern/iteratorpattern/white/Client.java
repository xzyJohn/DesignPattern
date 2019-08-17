package com.xzy.structuralpattern.iteratorpattern.white;

/**
 * @author xzy
 * @date 2019/8/17 15:21
 */
public class Client {
    public void operation(){
        Object[] objArray={"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate aggregate=new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator iterator=aggregate.createIterator();
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }

    }
}
