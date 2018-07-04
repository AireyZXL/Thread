package com.thread.TortoiseAndRabbitRace;


import com.thread.TortoiseAndRabbitRace.Animal.Calltoback;
/**
 * @author zxlei1
 * @version 1.0  2018年06月26日 zxlei1 create
 * @create 2018年06月26日 14:40
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/
public class LetOneStop implements Calltoback {

    //动物对象
    public Animal an;

    // 获取动物对象，可以传入兔子或乌龟的实例
    public LetOneStop(Animal an) {
        this.an = an;
    }

    // 让动物的线程停止
    @Override
    public void win() {
       an.stop();
    }
}
