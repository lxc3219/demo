package org.melody.demo.design.principle.ocp;

public class SnowCakeDiscount extends SnowCake {

    public SnowCakeDiscount(Integer id, String taste, Double price) {
        super(id, taste, price);
    }

    @Override
    public Integer getID() {
        return super.getID();
    }

    @Override
    public String getTaste() {
        return super.getTaste();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }

    @Override
    public String toString() {
        return "SnowCake{" +
                "id=" + super.getID() +
                ", taste='" + super.getTaste()+ '\'' +
                ", price=" + super.getPrice()*0.8 +
                '}';
    }
}
