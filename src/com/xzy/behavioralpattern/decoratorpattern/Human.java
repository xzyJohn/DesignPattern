package com.xzy.behavioralpattern.decoratorpattern;

/**
 * 被装饰者
 * @author xzy
 * @date 2019/8/16 13:56
 */
public interface Human {
    /**
     * 基础动作，穿衣服
     */
    public void wearClothes();

    /**
     * 基础动作，走去哪
     */
    public void walkToWhere();
}
