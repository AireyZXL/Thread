package com.thread.station;

/**
 * @author zxlei1
 * @version 1.0  2018年06月26日 zxlei1 create
 * @create 2018年06月26日 8:33
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/


/**
 * 程序分析：
 * (1)票数要使用同一个静态值
 * (2)为保证不会出现卖出同一个票数，要java多线程同步锁。
 * 设计思路：
 * (1)创建一个站台类Station，继承Thread，重写run方法，在run方法里面执行售票操作！
 * 售票要使用同步锁：即有一个站台卖这张票时，其他站台要等这张票卖完！
 * (2)创建主方法调用类
 */
public class Station extends Thread {

    /**
     * 通过构造方法给线程名称赋值
     *
     * @param name
     */
    public Station(String name) {
        //给线程名称赋值
        super(name);
    }

    //为了保证票数的一致，票数要静态
    public static Integer ticket = 20;
    //创建一个静态钥匙，值是任意的
    public static Object obj = "aa";


    @Override
    public void run() {

        while (ticket > 0) {
            // 这个很重要，必须使用一个锁，
            // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(getName() + "卖出了第" + ticket + "票");
                    ticket--;
                } else {
                    System.out.println("票卖完了!");
                }

            }
            try {
                //休息一秒
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
