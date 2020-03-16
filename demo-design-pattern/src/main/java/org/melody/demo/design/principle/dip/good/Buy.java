package org.melody.demo.design.principle.dip.good;

/**
 * 构造方法
 */
public class Buy {

    public void buy(Things things){
        things.buyThings();
    }

}

/**
 * 构造器注入
 */
class Buy1 {

    private Things things;

    public Buy1(Things things) {
        this.things = things;
    }

    public void buy() {
        things.buyThings();
    }
}

/**
 * Setter 注入
 */
class Buy2 {

    private Things things;

    public void setThings(Things things) {
        this.things = things;
    }

    public void buy(){
        things.buyThings();
    }
}
