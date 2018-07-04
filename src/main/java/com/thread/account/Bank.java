package com.thread.account;

/**
 * @author zxlei1
 * @version 1.0  2018年06月26日 zxlei1 create
 * @create 2018年06月26日 9:18
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/

import java.util.Objects;

/**
 * 两个人AB通过一个账户A在柜台取钱和B在ATM机取钱！
 * 钱的数量要设置成一个静态的变量，两个人要取的同一个对象值。
 */
public class Bank {
    //假设一个账户有1000元钱
    public static double money = 1000;

    //柜台Counter的取钱方法
    private void Counter(double money) {
        Bank.money -= money;
        System.out.println("柜台取钱" + money + "元，还剩" + Bank.money + "元！");
    }

    //ATM取钱的方法
    private void ATM(double money) {
        Bank.money -= money;
        System.out.println("ATM取钱" + money + "元，还剩" + Bank.money + "元！");
    }
    //提供一个对外取款途径，防止直接调取方法同时取款时，并发余额显示错误
    public synchronized void outMoney(double money,String mode) throws Exception {
        if (money>Bank.money){
            //校验余额是否充足
            throw new Exception("取款金额"+money+",余额只剩"+Bank.money+",取款失败");
        }

        if (Objects.equals(mode,"ATM")){
            ATM(money);
        }else {
            Counter(money);
        }
    }



}
