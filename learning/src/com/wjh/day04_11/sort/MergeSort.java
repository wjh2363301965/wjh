package com.wjh.day04_11.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {12,13,4112,14,12,14,121,4,4,53,64,7,535,2,434,62,64};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }



    /*

    public static void sort(int[] arr){

        sort2(arr,0,(arr.length-1)/2,arr.length-1);

    }

    private static void sort2(int[] arr,int start,int middle,int end ) {
        int[] temp=new int[(end-start)/2+1];
        int k = 0;
        int i = middle+1;
        int a = start;
        while (a<=middle && i<=end){
            temp[k++] =arr[a]<=arr[i]? arr[a++]:arr[i++];
        }
        if (a>middle){
            temp[k++] = arr[i++];
        }
        if (i>end){
            temp[k++]= arr[a++];
        }

        if (start<middle){
            sort2(arr,start,(middle-start)/2+middle,middle);
        }
        if ((middle)+1<end){
            sort2(arr,middle+1,(end-(middle+1))+middle,end);
        }
     int tt = 0;
        arr[start++]=temp[tt++];

    }
*/

    public static void sort(int[] arr){
        sort2(arr,0,arr.length-1);
    }

    private static void sort2(int[] arr, int left, int right) {
        if (left == right) return;

        int middle = left +(right -left)/2;
        sort2(arr,left,middle);
        sort2(arr,middle+1,right);
        sort3(arr,left,middle,right);
    }

    private static void sort3(int[] arr, int left, int middle, int right) {
        int[] tem = new int[right-left+1];
        int i = left;
        int j = middle+1;
        int k = 0;
        while (i<=middle && j<=right){
            tem[k++] = arr[i]<arr[j]? arr[i++]:arr[j++];
        }
        while(i<=middle){
            tem[k++]=arr[i++];
        }
        while(j<=right){
            tem[k++] = arr[j++];
        }

        int index = 0;
        while(left<= right){
            arr[left++]=tem[index++];
        }

    }


}
