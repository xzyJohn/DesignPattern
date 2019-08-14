package com.xzy.creatingpattern.factorypattern.simplefactory;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/14 13:25
 */
public class Main {

    public static void main(String[] args){
        Food noodle=SimpleFactory.makeFood("noodle");
        noodle.makeFood();
        Food rice=SimpleFactory.makeFood("rice");
        rice.makeFood();
    }
}
