package org.melody.demo.design.principle.crp.good;

public class CrpTest {

    public static void main(String[] args){
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MySQLConnection());
        productDao.addProduct();
    }
}
