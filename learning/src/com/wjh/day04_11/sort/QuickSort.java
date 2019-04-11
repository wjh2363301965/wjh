package com.wjh.day04_11.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,12,31,12,314,142,132,121,414,1122,144421};
        sort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }




    private static void sort(int[] arr, int start, int end) {

        int a =start;
        int b = end;
        int c = arr[start];
        while (a<b){
            while (a<b && arr[b]>=c){
                b--;
            }
            if (arr[b]<=c){
            int temp = arr[b];
            arr[b] = c;
            c = temp;
            }

            while (a<b && arr[a]<=c){
                a++;
            }
            if (arr[a]>=c) {
                int temp2 = arr[a];
                arr[a] = c;
                c = temp2;
            }
        }

        if (a>start){
            sort(arr,start,a-1);
        }
        if (b<end){
            sort(arr,b+1,end);
        }

    }
}
