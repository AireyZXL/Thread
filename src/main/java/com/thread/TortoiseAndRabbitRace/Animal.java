package com.thread.TortoiseAndRabbitRace;

/**
 * @author zxlei1
 * @version 1.0  2018年06月26日 zxlei1 create
 * @create 2018年06月26日 14:27
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/
public abstract class Animal extends Thread{

    public int length=200;

    public abstract void running();

    @Override
    public void run() {
        super.run();
        while (length>0){
            running();
        }
    }

    // 在需要回调数据的地方（两个子类需要），声明一个接口
    public static interface Calltoback {
        public void win();
    }

    // 2.创建接口对象
    public Calltoback calltoback;
}
