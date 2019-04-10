package com.wjh.day04_09.sort.MergeSort;

public class MergeSort {

   /* // 归并排序，递归实现
    public void sortMergeRecursion(int[] nums) {
        sortMergeRecursionHelper(nums, 0, nums.length - 1);
    }
    public void sortMergeRecursionHelper(int[] nums,int left, int right) {
        if(left == right) return;  // 当待排序的序列长度为1时，递归开始回溯，进行merge
        int middle = left + (right - left) / 2;
        sortMergeRecursionHelper(nums, left, middle);
        sortMergeRecursionHelper(nums, middle + 1, right);
        mergeArr(nums, left, middle, right);
    }
    public void mergeArr(int[] nums, int left, int middle, int right) {
        int[] tem = new int[right - left + 1];
        int i = left, j = middle + 1, k = 0;
        while(i <= middle && j <= right) {
            tem[k++] = nums[i] < nums[j]? nums[i++] : nums[j++];
        }
        while(i <= middle) {
            tem[k++] = nums[i++];
        }
        while(j <= right) {
            tem[k++] = nums[j++];
        }
        // 将辅助数组数据写入原数组
        int index = 0;
        while(left <= right) {
            nums[left++] = tem[index++];
        }
    }*/


   public static void mergeSort1(int[] arr){
       mergeSort2(arr,0,arr.length-1);
   }

    private static void mergeSort2(int[] arr, int start, int end) {
       if (start==end)return;
       int middle = start+(end-start)/2;



           mergeSort2(arr,start,middle);


           mergeSort2(arr,middle+1,end);

       mergeSort3(arr,start,middle,end);

    }

    private static void mergeSort3(int[] arr, int start, int middle, int end) {

       int[] temp = new int[end-start+1];
       int i=start;
       int j = middle+1;
       int k = 0;
       while (i<=middle && j<= end){
           if (arr[i]<=arr[j]){
               temp[k] = arr[i];
               i++;
               k++;
           }

           if (arr[i]>arr[j]){
               temp[k] =arr[j];
               j++;
               k++;
           }

       }
       if (i>middle){
           temp[k++] = arr[j++];
       }
       if(j>end){
           temp[k++]=arr[i++];
       }

       int index = 0;
       while (start<=end){
           arr[start++]=temp[index++];
       }


    }


}
