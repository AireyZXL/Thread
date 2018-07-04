package com.thread.TortoiseAndRabbitRace;

/**
 * @author zxlei1
 * @version 1.0  2018年06月26日 zxlei1 create
 * @create 2018年06月26日 14:29
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/
public class Rabbit extends Animal {

    public Rabbit(){
        setName("兔子");
    }

    @Override
    public void running() {
     //兔子速度
        int dis=5;
        length-=dis;

        System.out.println("兔子跑了" + dis + "米，距离终点还有" + length + "米");

        if (length<=0){
            length=0;
            System.out.println("兔子获得了胜利");
            // 给回调对象赋值，让乌龟不要再跑了
            if (calltoback != null) {
                calltoback.win();
            }
        }

       try {
            if ((200 - length) % 20 == 0) {    // 每20米休息一次,休息时间是1秒
                sleep(1000);
            } else {                //每0.1秒跑5米
                sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
