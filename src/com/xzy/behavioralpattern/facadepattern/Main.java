package com.xzy.behavioralpattern.facadepattern;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/16 15:13
 */
public class Main {
    public static void main(String[] args){
        ShapeMaker shapeMaker=new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
