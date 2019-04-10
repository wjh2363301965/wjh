package com.wjh.day04_09.Thread;

public class BiaoJi {


    //当aa为false时，B线程叫醒A
    private static boolean aa = true;
    //每隔一秒，A线程让bb减1
    private static int bb = 0;

    public BiaoJi() {
    }

    public static boolean isAa() {
        return aa;
    }

    public static void setAa(boolean aa) {
        BiaoJi.aa = aa;
    }

    public static int getBb() {
        return bb;
    }

    public static void setBb(int bb) {
        BiaoJi.bb = bb;
    }
}
