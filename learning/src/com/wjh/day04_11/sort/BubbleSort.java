package com.wjh.day04_11.sort;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {12,3,141,41,411,21,12,3,12,4,5,6};
        sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void sort(int[] arr){

        for (int i = 0;i<arr.length-1;i++){

            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }


    }

}
