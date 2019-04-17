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

        if (size > 1) {
            NewMinHeapCustom.sort(queue);
        }

        //这是一个后加的方法，如果数组里面有一个元素，那么size会由0变成1，这个瞬间，启动listenThread方法时刻监听队列
        synchronized (queue) {
            if (size == 1) {
                listenThread();
            }
        }
    }

private static int a=0;//用来记录下面的线程

    private static void listenThread(){
         new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    //如果队列中有一个元素，那么当执行完移除后会自动break，这样后来再添加队列里还是相当于一个元素，
                    // 所以我定义一个变量，每次移除后不着急break，循环多次，变量达到一定程度后才break
                    if (queue.length==0){

                        System.out.println("队伍中没有任务了");
                        if (a >= 100){
                            break;
                        }
                        a++;
                        notify();

                    }





                }
            }
        }).start();

    }


}
