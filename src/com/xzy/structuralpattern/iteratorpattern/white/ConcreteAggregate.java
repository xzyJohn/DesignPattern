package com.xzy.structuralpattern.iteratorpattern.white;


/**
 * 具体聚集角色类
 *
 * @author xzy
 * @date 2019/8/17 14:59
 */
public class ConcreteAggregate extends Aggregate {
    private Object[] objArray = null;

    /**
     * 构造方法，传入聚合对象的具体内容
     * @param objArray 内容
     */
    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 取值方法，向外界提供聚集元素
     * @param index 下标
     * @return 聚集元素
     */
    public Object getElement(int index){
        if(index<objArray.length){
            return objArray[index];
        }else {
            return null;
        }
    }

    /**
     * 取值方法，向外界提供聚集的大小
     * @return 聚集的大小
     */
    public int size(){
        return objArray.length;
    }
}
