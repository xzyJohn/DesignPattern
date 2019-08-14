package com.xzy.creatingpattern.builderpattern;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/14 17:28
 */
public class Main {
    public static void main(String[] args){
        Director director=new Director();
        ProductHouse productHouse=director.constructProduct(new ConcreteBuilder());
        System.out.println(productHouse.getBasic());
        System.out.println(productHouse.getWall());
        System.out.println(productHouse.getRoofed());

    }
}
