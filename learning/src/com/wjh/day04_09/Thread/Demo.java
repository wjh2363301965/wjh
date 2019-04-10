package com.wjh.day04_09.Thread;

public class Demo {

    public static void main(String[] args) {

        Thread threadA=new Thread(new ThreadA());
        Thread threadB = new Thread(new ThreadB());

        threadA.start();
        threadB.start();


    }

}
