package com.xzy.behavioralpattern.proxypattern;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/16 16:20
 */
public class Main {
    public static void main(String[] args){
        FoodService foodService=new FoodServiceProxy();
        foodService.makeChicken().makeFood();
    }
}
