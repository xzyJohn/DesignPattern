package com.xzy.behavioralpattern.bridgepattern;

/**
 * 桥梁类的实现类
 * @author xzy
 * @date 2019/8/15 15:16
 */
public class MyBridge extends Bridge {
    private Driver driver;

    @Override
    public Driver getDriver() {
        return driver;
    }

    @Override
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void connect(){
        driver.connect();
    }
}
