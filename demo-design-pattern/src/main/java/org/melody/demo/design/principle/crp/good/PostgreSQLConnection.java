package org.melody.demo.design.principle.crp.good;

public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return " PostgreSQL数据库连接";
    }
}