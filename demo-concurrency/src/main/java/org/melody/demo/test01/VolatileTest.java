package org.melody.demo.test01;

/**
 *  https://www.bilibili.com/video/av59548640?p=1
 *
 * volatile关键字：当多个线程进行操作共享数据时，可以保证内存中的数据可见。相较于synchronized是一种较为轻量级的同步策略。
 * 注意：
 *  1.不具备“互斥性”。
 *  2.不能保证变量的“原子性”。
 */
public class VolatileTest {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();

        while(true) {
            if(td.isFlag()) {
                System.out.println("----------------");
                break;
            }
//            synchronized (td) {
//                if(td.isFlag()) {
//                    System.out.println("----------------");
//                    break;
//                }
//            }
        }
    }
}

class ThreadDemo implements Runnable {
//    private boolean flag = false;
    private volatile boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }
        flag = true;
        System.out.println("flag=" + flag);
    }

    public boolean isFlag() {
        return flag;
    }
}
