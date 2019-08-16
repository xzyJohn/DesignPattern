package com.xzy.behavioralpattern.proxypattern;

/**
 * 制作面食
 * @author xzy
 * @date 2019/8/16 16:11
 */
public class Noodle implements Food {
    @Override
    public void makeFood() {
        System.out.println("制作面食");
    }
}
