package com.xdq.chapter01.test;

/**
 * @author: 徐东强
 * @date: 2018/9/22 上午12:33
 * @description:
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("my thread");
    }
}
