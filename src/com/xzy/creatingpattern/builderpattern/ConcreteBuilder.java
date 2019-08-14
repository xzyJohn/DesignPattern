package com.xzy.creatingpattern.builderpattern;

/**
 * 具体的建造
 * @author xzy
 * @date 2019/8/14 17:24
 */
public class ConcreteBuilder implements Builder {
    private ProductHouse productHouse;

    public ConcreteBuilder(){
        productHouse=new ProductHouse();
    }
    @Override
    public void buildBasic() {
        productHouse.setBasic("打好房子的基础");
    }

    @Override
    public void buildWalls() {
        productHouse.setWall("砌好房子的墙");
    }

    @Override
    public void roofed() {
        productHouse.setRoofed("房子封顶");
    }

    @Override
    public ProductHouse buildHouse() {
        return productHouse;
    }
}
