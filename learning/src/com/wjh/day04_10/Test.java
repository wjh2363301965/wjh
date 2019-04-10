package com.wjh.day04_10;

import java.util.TimerTask;

public class Test {
    //主方法就是线程b
    public static void main(String[] args) {
        //    Thread threadA = new Thread(new ThreadA());
        ThreadA threadA = new ThreadA();
        threadA.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadA.changBiaoJi();
        //threadA.interrupt();

    }


}
