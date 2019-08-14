package com.xzy.creatingpattern.factorypattern.simplefactory;

/**
 * 生产米饭
 * @author xzy
 * @date 2019/8/14 13:40
 */
public class Rice implements Food {
    @Override
    public void makeFood() {
        System.out.println("生产了米饭");
    }
}
