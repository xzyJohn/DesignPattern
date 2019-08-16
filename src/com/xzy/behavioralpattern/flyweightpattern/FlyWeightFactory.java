package com.xzy.behavioralpattern.flyweightpattern;

import java.util.Hashtable;

/**
 * 工厂方法类
 * @author xzy
 * @date 2019/8/16 15:34
 */
public class FlyWeightFactory {
    private Hashtable flyWeights=new Hashtable();

    public FlyWeightFactory(){}

    public FlyWeight getFlyWeight(Object object){
        FlyWeight flyWeight= (FlyWeight) flyWeights.get(object);
        if(flyWeight==null){
            //产生新的ConcreteFlyWeight
            flyWeight=new ConcreteFlyWeight((String) object);
            flyWeights.put(object,flyWeight);
        }
        return flyWeight;
    }

    public int getFlyWeightSize(){
        return flyWeights.size();
    }
}
