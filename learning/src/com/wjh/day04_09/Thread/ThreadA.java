package com.wjh.day04_09.Thread;

public class ThreadA implements Runnable {
    @Override
    public void run() {

        System.out.println("A:开始睡觉，预计睡觉10秒");
        for (int i = 0; i < 10; i++) {
            if (BiaoJi.isAa()==false){
                System.out.println("A:刚睡着就被叫醒了");
                break;
            }

            try {
                Thread.sleep(1000);
                System.out.println("A:睡了"+i+"秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            BiaoJi.setBb(BiaoJi.getBb()+1);

        }
    }
}
