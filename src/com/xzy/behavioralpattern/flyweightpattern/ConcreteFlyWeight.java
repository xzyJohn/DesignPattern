package com.xzy.behavioralpattern.flyweightpattern;

/**
 * 实现类
 * @author xzy
 * @date 2019/8/16 15:31
 */
public class ConcreteFlyWeight extends FlyWeight{
    private String string;
    public ConcreteFlyWeight(String string){
        this.string=string;
    }
    @Override
    public void operation() {
        System.out.println("Concrete---FlyWeight : " + string);
    }
}
