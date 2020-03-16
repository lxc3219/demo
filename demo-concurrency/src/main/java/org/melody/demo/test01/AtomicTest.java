package org.melody.demo.test01;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 一、i++ 的原子性问题： i++ 的操作实际上分为三个步骤“读"、”改“、”写“
 *      int i = 10;
 *      i = i++;
 *
 *      int temp = i;
 *      i = i + 1;
 *      i = temp;
 *
 * 二、原子变量：jdk1.5 后 java.util.concurrent.atomic 包下提供了常用的原子变量；
 *      1.volatile保证内存的可见性；
 *      2.CAS （Compare-And-Swap）算法保证数据的原子性；
 *          CAS 算法是硬件对于并发操作共享数据的支持
 *          CAS 包含是三个操作数：
 *              内存值 V，预估值 A，更新值 B
 *              当且仅当 V == A时， V = B，否者将不做任何操作。
 */
public class AtomicTest {
    public static void main(String[] args) {
        AtomicDemo ad = new AtomicDemo();
        for (int i = 0; i < 10; i++) {
            new Thread(ad).start();
        }
    }
}

class AtomicDemo implements Runnable {
//    private volatile int serialNumber = 0;
    private AtomicInteger serialNumber = new AtomicInteger(0);

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch(InterruptedException e) {

        }
        System.out.println(getSerialNumber());
    }

    public int getSerialNumber() {
        return serialNumber.getAndIncrement();
    }
}
