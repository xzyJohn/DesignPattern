package com.xzy.creatingpattern.builderpattern;

/**
 * 抽象建造
 * @author xzy
 * @date 2019/8/14 17:21
 */
public interface Builder {
    /**
     * 打基础
     */
    public void buildBasic();

    /**
     * 砌墙
     */
    public void buildWalls();

    /**
     * 封顶
     */
    public void roofed();

    /**
     * 造房子
     * @return 房子
     */
    public ProductHouse buildHouse();
}
