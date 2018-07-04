package com.thread.account;

/**
 * @author zxlei1
 * @version 1.0  2018年06月26日 zxlei1 create
 * @create 2018年06月26日 13:34
 * @copyright Copyright @2018 广电运通 All rights reserved.
 **/
public class PersonB implements Runnable {


    private Bank bank;

    private String mode;

    public PersonB(Bank bank, String mode) {
        this.bank = bank;
        this.mode = mode;
    }

    @Override
    public void run() {

        while (Bank.money>=200){
            try {
                bank.outMoney(200,mode);
            } catch (Exception e1) {
                e1.printStackTrace();
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
