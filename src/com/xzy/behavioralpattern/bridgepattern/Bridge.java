package com.xzy.behavioralpattern.bridgepattern;

/**
 * @author xzy
 * @date 2019/8/15 15:14
 */
public abstract class Bridge {
    private Driver driver;

    public void connect() {
        driver.connect();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
