package com.wjh.day04_09.Thread;

public class ThreadB implements Runnable {
    @Override
    public void run() {

        while (true) {
            if (BiaoJi.getBb()==5){
                System.out.println("B:A睡了5秒了，要叫醒他了");
                BiaoJi.setAa(false);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
