package com.xzy.behavioralpattern.proxypattern;

/**
 * 食物接口
 * @author xzy
 * @date 2019/8/16 16:09
 */
public interface FoodService {
    /**
     * 制作鸡肉
     * @return 鸡肉
     */
    Food makeChicken();

    /**
     * 制作面食
     * @return 面食
     */
    Food makeNoodle();
}
