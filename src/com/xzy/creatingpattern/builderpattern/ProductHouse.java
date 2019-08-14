package com.xzy.creatingpattern.builderpattern;

/**
 * 具体产品 房子
 * @author xzy
 * @date 2019/8/14 17:18
 */
public class ProductHouse {
    /**
     * 地基
     */
    private String basic;
    /**
     * 墙
     */
    private String wall;
    /**
     * 楼顶
     */
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
