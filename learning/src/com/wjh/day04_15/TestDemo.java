package com.wjh.day04_15;

import org.junit.Test;

import java.util.Arrays;

public class TestDemo {

  @Test
    public void test1(){
      int[] a = {14,17,20,30,40,89};
      MinHeapCustom heapCustom = new MinHeapCustom(a);
//      int[] insert = heapCustom.insert(2);
//      for (int i : i2 nsert) {
//          System.out.println(i);
//      }
  heapCustom.removeMin();
      int[] heap = heapCustom.getHeap();
      for (int i : heap) {
          System.out.println(i);
      }

  }



  @Test
    public void test2(){
      int[] a = new int[]{13,14};
      int[] ints = Arrays.copyOf(a, a.length + 1);
      System.out.println(ints.length);

  }


  @Test
    public void test3(){
      Time1 time1 = new Time1() {
          @Override
          public void run() {
              System.out.println("111");
          }
      };
      Time1 time2 = new Time1() {
          @Override
          public void run() {
              System.out.println("22222");
          }
      };
      Time1 time3  = new Time1() {
          @Override
          public void run() {
              System.out.println("3333");
          }
      };
      Time2.schedule(time1,1000,0);
      System.out.println("====");
      Time2.schedule(time2,500,0);
      System.out.println("=====");
      Time2.schedule(time3,250,0);



  }
}
