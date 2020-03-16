package org.melody.demo.design.principle.srp.bad;

public class Bird {

    public void mainMoveMode(String birdName){
        if ("变色龙".equals(birdName)){
            System.out.println("变色龙用四肢走");
        }else {
            System.out.println(birdName+"用翅膀飞");
        }
    }

}