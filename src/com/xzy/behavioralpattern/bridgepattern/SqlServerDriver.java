package com.xzy.behavioralpattern.bridgepattern;

/**
 * @author xzy
 * @date 2019/8/15 15:14
 */
public class SqlServerDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("连接SqlServer数据库");
    }
}
