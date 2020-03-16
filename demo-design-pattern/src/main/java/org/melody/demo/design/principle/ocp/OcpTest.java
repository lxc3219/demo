package org.melody.demo.design.principle.ocp;

public class OcpTest {

    public static void main(String[] args) {
        SnowCake sc1 = new SnowCake(100,"原味",55.0);
        System.out.println(sc1);

        SnowCake sc2 = new SnowCakeDiscount(100,"原味",55.0);
        System.out.println(sc2);
    }

}
