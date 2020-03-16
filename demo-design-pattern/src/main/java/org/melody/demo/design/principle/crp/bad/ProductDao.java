package org.melody.demo.design.principle.crp.bad;

public class ProductDao extends DBConnection {
    public void addProduct(){
        String conn = super.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}