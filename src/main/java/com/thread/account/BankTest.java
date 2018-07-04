package com.thread.account;

/**
 * @author zxlei1
 * @version 1.0  2018年06月26日 zxlei1 create
 * @create 2018年06月26日 14:04
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/
public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        PersonA a=new PersonA(bank,"Counter");
        PersonB b=new PersonB(bank,"ATM");

        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
    }
}
