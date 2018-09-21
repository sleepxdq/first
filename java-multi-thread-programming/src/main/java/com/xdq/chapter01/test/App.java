package com.xdq.chapter01.test;

/**
 * @author: 徐东强
 * @date: 2018/9/22 上午12:34
 * @description:
 **/
public class App {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("main");
    }
}
