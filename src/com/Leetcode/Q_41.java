package com.Leetcode;

import java.util.Arrays;

public class Q_41 {

    public static void main(String[] args) {
        int [] arr= {0,1};
        sort(arr);
        int min_positive=FMP(arr);
        System.out.println(min_positive);
    }

    public static int FMP(int [] arr){
        int check=1;
        sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] >0 && arr[i]<=arr.length){
                if(check==arr[i]){
                    check++;
                }
            }
        }
        return check;
    }


    static void sort (int [] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i] >0 && nums[i]<=nums.length){
            int correct= nums[i]-1;
                if(nums[correct]!=nums[i]){
                swap(nums,i,correct);
                }else{
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
