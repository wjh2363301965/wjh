package com.wjh.day04_15;

import java.util.Arrays;

public class Time2 {

    //这个是以time1的start大小来排列
    private static TimeQueue[] queue = new TimeQueue[1];

    private static int size = 0;

  /* 这个方法，会把每一个传过来的Time1和对应的start封装成一个TimeQueue对象，
    并以最小堆的方式排列完毕（以传过来的start的值的最小堆方式排列所在的TimeQueue）*/
    public static void schedule(Time1 time1, int start, int interval) {
        if (size >= queue.length) {
            TimeQueue[] aaa = Arrays.copyOf(queue, queue.length + 1);
            queue=aaa;
        }
        TimeQueue timeQueue = new TimeQueue(time1, start);
        queue[size++] = timeQueue;
        if (size > 0) {
            NewMinHeapCustom.sort(queue);
        }

        for (TimeQueue timeQueue1 : queue) {
            System.out.println(timeQueue1.getTimeindex());
        }
    }




}
