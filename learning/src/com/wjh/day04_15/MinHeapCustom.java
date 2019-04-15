package com.wjh.day04_15;

import java.util.Arrays;

public class MinHeapCustom {

    private static int[] heap;

    public MinHeapCustom(int[] heap) {
        this.heap = heap;
    }

    public static int[] insert(int num) {

        if (heap.length != 0) {
            int[] newHeap = Arrays.copyOf(heap, heap.length + 1);

            newHeap[newHeap.length - 1] = num;
            heap = newHeap;
            insertSort(heap,heap.length-1);
        } else {
            throw new RuntimeException("数组创建不对");
        }

        return heap;
    }

    private static void insertSort(int[] heap,int indexSon) {

        int indexFather = (indexSon-1)/2;
      /*  if (indexFather<0){
            return;
        }*/
       if (heap[indexSon]<=heap[indexFather]){
           int temp = heap[indexSon];
           heap[indexSon] = heap[indexFather];
           heap[indexFather]= temp;
       }else {
            return;
       }
       if (indexFather==0){
           return;
       }
       insertSort(heap,indexFather);
    }


}
