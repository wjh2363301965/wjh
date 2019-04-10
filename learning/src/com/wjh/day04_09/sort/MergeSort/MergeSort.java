package com.wjh.day04_09.sort.MergeSort;

public class MergeSort {

    // 归并排序，递归实现
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
    }


}
