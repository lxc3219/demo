package org.melody.demo.design.principle.crp.good;

public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}