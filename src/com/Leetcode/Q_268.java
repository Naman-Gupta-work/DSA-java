package com.Leetcode;

import java.util.Arrays;

public class Q_268 {

    public static void main(String[] args) {
        int [] nums = {0,1,2};

        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        zero_sort(nums);
        for (int i=0;i<nums.length;i++){
            if(i !=nums [i] ){
               return i;
            }
        }
        return nums.length;
    }

    static void zero_sort (int [] arr) {
        int i = 0;
        while (i < arr.length) {
                int correct = arr[i] ;
                if(correct<arr.length) {
                    if (arr[correct] != arr[i]) {
                        swap(arr, i, correct);
                    } else {
                        i++;
                    }
                }
                else{
                    i++;
                }

            }

    }
    static void swap(int [] arr, int a, int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
