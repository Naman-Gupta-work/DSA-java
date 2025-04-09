package com.Leetcode;

import java.util.Arrays;
// google question
public class Q_448 {
    public static void main(String[] args) {
        int [] arr ={4,3,2,7,8,2,3,1};
        findDisappearedNumbers(arr);
    }
    public static void findDisappearedNumbers(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                System.out.println(i+1);
            }
        }
        System.out.println(0);

    }

    static void sort (int [] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else{
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
