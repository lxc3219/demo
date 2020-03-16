package org.melody.demo.design.principle.crp.good;

public class ProductDao  {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        //通过组合的方式
        String conn =dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}