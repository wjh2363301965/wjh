package com.wjh.day04_10;

public class ThreadA extends Thread {
    private int a=1;

    public boolean isBiaoJi() {
        return biaoJi;
    }

    public void setBiaoJi(boolean biaoJi) {
        this.biaoJi = biaoJi;
    }

    boolean biaoJi=false;
    @Override
    public void run() {
        System.out.println("开始睡觉");
        while (true){
            if (biaoJi==true){
                System.out.println("刚睡着就被叫醒了");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("睡了第"+a+"秒");
            a++;
        }


    }


    public void changBiaoJi(){
        biaoJi=true;
    }

}
