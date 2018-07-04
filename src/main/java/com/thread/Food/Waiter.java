package com.thread.Food;

/**
 * @author zxlei1
 * @version 1.0  2018年06月27日 zxlei1 create
 * @create 2018年06月27日 19:42
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/
public class Waiter extends Thread {

    /**
     * 共用一个KFC
     */
    KFC kfc;

    public Waiter(KFC kfc) {
        this.kfc = kfc;
    }

    @Override
    public void run() {
        int size=(int)(Math.random()*5)+5;//每次生产的数量
        while (true) {
            kfc.produce(size);//传入每次生产的数量
        }
    }
}
