package com.xzy.creatingpattern.builderpattern;

/**
 * 建造者
 * @author xzy
 * @date 2019/8/14 17:27
 */
public class Director {
    public ProductHouse constructProduct(ConcreteBuilder concreteBuilder){
        concreteBuilder.buildBasic();
        concreteBuilder.buildWalls();
        concreteBuilder.roofed();
        return concreteBuilder.buildHouse();
    }
}
