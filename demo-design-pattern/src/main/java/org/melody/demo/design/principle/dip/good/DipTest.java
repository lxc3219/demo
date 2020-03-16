package org.melody.demo.design.principle.dip.good;

public class DipTest {

    public static void main(String[] args) {
        // 构造方法
        Buy b = new Buy();
        b.buy(new BuyMouse());
        b.buy(new BuyKeyboard());
        b.buy(new BuyMousePad());

        // 构造器
        Buy1 b1 = new Buy1(new BuyMouse());
        b1.buy();

        // Setter 注入
        Buy2 b2 = new Buy2();
        b2.setThings(new BuyMouse());
        b2.buy();
    }

}
