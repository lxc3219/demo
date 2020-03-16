package org.melody.demo.design.principle.dip.good;

public class BuyKeyboard implements Things {

    @Override
    public void buyThings() {
        System.out.println("小明正在买键盘");
    }

}