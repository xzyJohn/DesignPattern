package com.xzy.behavioralpattern.bridgepattern;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/15 15:19
 */
public class Main {
    public static void main(String[] args) {
        Bridge mysqlBridge = new MyBridge();

        Driver mysqlDriver = new MysqlDriver();
        mysqlBridge.setDriver(mysqlDriver);
        mysqlBridge.connect();

        Driver sqlServerDriver = new SqlServerDriver();
        mysqlBridge.setDriver(sqlServerDriver);
        mysqlBridge.connect();
    }
}
