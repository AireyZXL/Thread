package com.thread.TortoiseAndRabbitRace;

/**
 * @author zxlei1
 * @version 1.0  2018年06月26日 zxlei1 create
 * @create 2018年06月26日 14:51
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/
public class AnimalTest {

    public static void main(String[] args) {
        // 实例化乌龟和兔子
        Tortoise tortoise=new Tortoise();
        Rabbit rabbit=new Rabbit();
        // 回调方法的使用，谁先调用calltoback方法，另一个就不跑了
        LetOneStop let1=new LetOneStop(tortoise);
        // 让兔子的回调方法里面存在乌龟对象的值，可以把乌龟stop
        rabbit.calltoback=let1;
        LetOneStop let2=new LetOneStop(rabbit);
        tortoise.calltoback=let2;

        //开始跑
        tortoise.start();
        rabbit.start();

    }
}
