package com.thread.station;

/**
 * @author zxlei1
 * @version 1.0  2018年06月26日 zxlei1 create
 * @create 2018年06月26日 8:39
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/

/**
 * java多线程同步锁的使用
 * 示例：三个售票窗口同时出售20张票
 */
public class StationTest {
    public static void main(String[] args) {
        //实例化站台对象，并为每一个站台取名字
        Station station1 = new Station("窗口1");
        //station1.setPriority(1);
        Station station2 = new Station("窗口2");
        //station2.setPriority(8);
        Station station3 = new Station("窗口3");
        //station3.setPriority(9);
        // 让每一个站台对象各自开始工作
        station1.start();
        station2.start();
        station3.start();

    }
}
