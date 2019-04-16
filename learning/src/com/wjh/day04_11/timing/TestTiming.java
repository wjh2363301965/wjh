package com.wjh.day04_11.timing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestTiming {

    @Test
    public void test1() {
        final long timeInterval = 1000;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("hello  !");
                    try {
                        Thread.sleep(timeInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }

    //  这串代码很有意思，我执行了多次有时控制台会打印出hello，而有时不会，
// 我目前分析原因可能是timer的方法开启了另一个线程，但没执行完，test的线程就结束了,导致一次hello都没打印，
//    而打印出hello的时候，可能是那一次timer的方法执行的很快，先一步执行完了，不知道我的推测对不对，稍后会详细查询资料
    @Test
    public void test2() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello  !!");

            }
        };
        Timer timer = new Timer();
        long delay = 0;
        long intevalPeriod = 1 * 1000;

        timer.scheduleAtFixedRate(task, delay, intevalPeriod);
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    @Test
    public void test3() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello !!!!!!");
            }
        };
        ScheduledExecutorService service =  Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable,10,1, TimeUnit.SECONDS);
    }


    @Test
    public void test4() {

        ArrayList<Integer> arr = new ArrayList();
        arr.add(5);
        arr.add(3);
        arr.add(7);
        for (Integer o : arr) {
            System.out.println(o);
        }

    }

}
