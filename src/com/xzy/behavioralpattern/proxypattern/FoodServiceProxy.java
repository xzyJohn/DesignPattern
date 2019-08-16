package com.xzy.behavioralpattern.proxypattern;

/**
 * 食物代理类
 * @author xzy
 * @date 2019/8/16 16:15
 */
public class FoodServiceProxy implements FoodService {
    private FoodService foodService=new FoodServiceImpl();
    @Override
    public Food makeChicken() {
        System.out.println("开始制作鸡肉");
        Food food=foodService.makeChicken();
        System.out.println("制作鸡肉完成");
        return food;
    }

    @Override
    public Food makeNoodle() {
        System.out.println("开始制作面食");
        Food food=foodService.makeNoodle();
        System.out.println("制作面食完成");
        return food;
    }
}
