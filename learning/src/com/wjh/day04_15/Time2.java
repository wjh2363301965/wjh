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

    //当我实在是不知道这个死循环什么时候应该结束，什么时候应该等着的时候，看了下源码，
    // 这种精妙的思想我感觉我吸收了一些O(∩_∩)O，所以定义了这个变量，不过虽然我看懂了这里，
    // 但目前我做的只有执行，没有循环，所以目前还用不了这个方法，我先自己想办法实现负的逻辑，
    //后期再继续优化，改方法
private static boolean newTasksMayBeScheduled=true;

    private static void listenThread(){
         new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                    try {
                        //如果队列为空，把锁换回去，进入无线等待状态
                        synchronized (queue){
                            if (queue.length==0 &&newTasksMayBeScheduled ==true){
                                queue.wait();
                            }
                             if (queue.length==0){
                                 break;
                             }
                            queue[0].getTime1().run();
                            NewMinHeapCustom.removeMin(queue);
                            if (queue.length!=0){
                                newTasksMayBeScheduled = false;
                            }

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();

    }


}
