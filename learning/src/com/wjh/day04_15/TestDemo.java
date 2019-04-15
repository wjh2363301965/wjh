package com.wjh.day04_15;

import org.junit.Test;

import java.util.Arrays;

public class TestDemo {

  @Test
    public void test1(){
      int[] a = {14,17,20,30,40,89};
      MinHeapCustom heapCustom = new MinHeapCustom(a);
      int[] insert = heapCustom.insert(2);
      for (int i : insert) {
          System.out.println(i);
      }
  }



  @Test
    public void test2(){
      int[] a = new int[]{13,14};
      int[] ints = Arrays.copyOf(a, a.length + 1);
      System.out.println(ints.length);
  }
}
