package com.xzy.behavioralpattern.proxypattern;

/**
 * 食物实现类
 * @author xzy
 * @date 2019/8/16 16:14
 */
public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeChicken() {
        return new Chicken();
    }

    @Override
    public Food makeNoodle() {
        return new Noodle();
    }
}
