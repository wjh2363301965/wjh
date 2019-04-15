package com.wjh.day04_15;

import java.util.Arrays;

public class MinHeapCustom {

    private  int[] heap;

    public MinHeapCustom(int[] heap) {
        this.heap = heap;
    }

    public  int[] getHeap() {
        return heap;
    }



    public  int[] insert(int num) {
        if (heap.length != 0) {
            int[] newHeap = Arrays.copyOf(heap, heap.length + 1);

            newHeap[newHeap.length - 1] = num;
            heap = newHeap;
            insertSort(heap, heap.length - 1);
        } else {
            throw new RuntimeException("数组创建不对");
        }

        return heap;
    }

    private  void insertSort(int[] heap, int indexSon) {
        int indexFather = (indexSon - 1) / 2;
        //这里是我递归出问题的地方，我认为-1/2应该等于一个负数，结果是等于0，导致一直递归O(∩_∩)O
      /*  if (indexFather<0){
            return;
        }*/
        if (heap[indexSon] <= heap[indexFather]) {
            int temp = heap[indexSon];
            heap[indexSon] = heap[indexFather];
            heap[indexFather] = temp;
        } else {
            return;
        }
        //这是后加的
        if (indexFather == 0) {
            return;
        }
        insertSort(heap, indexFather);
    }
//这个方法的目的：执行这个方法，会自动把堆顶的元素去掉并自动排列完毕，返回值是移除的元素的值
    public  int removeMin() {

        int temp = heap[heap.length-1];
        int removeNum = heap[0];
        heap[0] = temp;
        //又学会个新方法O(∩_∩)O
        int[] newHeap = Arrays.copyOfRange(heap, 0, heap.length - 1);
        heap = newHeap;
        if (heap.length>1)
        removeSort(heap,0);

        return removeNum;
    }

    private void removeSort(int[] heap,int indexFather) {
        int leftSon = indexFather*2+1;
        //下面这一个判断语句我想了好久
        if (indexFather<heap.length && heap.length-1<leftSon){
            return;
        }
        if (heap[indexFather]>=heap[leftSon]){
            int temp = heap[indexFather];
            heap[indexFather] = heap[leftSon];
            heap[leftSon] = temp;
        }

        removeSort(heap,leftSon);

    }


}
