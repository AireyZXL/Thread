package com.thread.Food;

/**
 * @author zxlei1
 * @version 1.0  2018年06月27日 zxlei1 create
 * @create 2018年06月27日 9:16
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/
public class Customer extends Thread{
    //KFC要传入，保证每一个服务员和用户在同一个KFC对象内
    KFC kfc;

    public Customer(KFC kfc) {
        this.kfc = kfc;
    }

    @Override
    public void run() {
        int size= (int) (Math.random()*5);
        while (true){
            kfc.consume(size);
        }
    }
}
