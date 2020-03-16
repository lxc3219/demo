package org.melody.demo.design.principle.dip.bad;

public class DipTest {

    public static void main(String[] args) {
        Buy buy = new Buy();
        buy.buyMouse();
        buy.buyKeyboard();
    }

}
