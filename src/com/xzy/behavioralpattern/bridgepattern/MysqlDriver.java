package com.xzy.behavioralpattern.bridgepattern;

/**
 * 连接Mysql
 * @author xzy
 * @date 2019/8/15 15:13
 */
public class MysqlDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("连接Mysql数据库");
    }
}
