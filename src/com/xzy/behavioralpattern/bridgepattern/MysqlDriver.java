package com.xzy.behavioralpattern.bridgepattern;

/**
 * @author xzy
 * @date 2019/8/15 15:13
 */
public class MysqlDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("链接Mysql数据库");
    }
}
