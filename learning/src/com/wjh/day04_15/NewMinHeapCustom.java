package com.wjh.day04_15;

import java.util.Arrays;

public class NewMinHeapCustom {




       // TimeQueue 数组是已经添加完最后一个元素却未排列的数组，这个类的目的就是以最小堆排列
    public static void sort(TimeQueue[] num) {
        insertSort(num,num.length-1);


    }

    private static void insertSort(TimeQueue[] heap, int indexSon) {
        int indexFather = (indexSon - 1) / 2;

        if (heap[indexSon].getTimeindex() <= heap[indexFather].getTimeindex()) {
            int temp = heap[indexSon].getTimeindex();
            heap[indexSon].setTimeindex(heap[indexFather].getTimeindex()); //相当于heap[indexSon] = heap[indexFather];
            heap[indexFather].setTimeindex(temp);
        } else {
            return;
        }
        //这是后加的
        if (indexFather == 0) {
            return;
        }
        insertSort(heap, indexFather);
    }

   /*  public static int removeMin() {

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

    private static void removeSort(int[] heap,int indexFather) {
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

    }*/
}
