package com.wjh.day04_30.learn1;

import java.util.Random;

public class Gerbil {
    //初始化的顺序，变量永远在方法前初始化（包括构造方法）
    int gerbilNumber;

    private static Random r = new Random();


    public Gerbil() {
        gerbilNumber = r.nextInt(10);

    }

    public int hop(){
        System.out.println(gerbilNumber);
        return gerbilNumber;
    }


    public static void main(String[] args) {
        try {
            int a = 1/0;
            System.out.println(a);
            Integer
        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            System.out.println("hahah");
        }


    }
}
