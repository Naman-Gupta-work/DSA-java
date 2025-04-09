package com.Leetcode;

import java.util.Arrays;

public class Q_645 {

    public static void main(String[] args) {
    int [] arr={1,2,3,4,9,6,7,8,9};
        System.out.println(Arrays.toString(set_mismatch(arr)));
    }

    public static void sort (int [] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                int temp =arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
    }


    public static int [] set_mismatch(int [] nums){
        int n= nums.length+1;
        int [] ans= new int [n];
        int [] result=new int [2];
        for(int i=0;i<nums.length;i++){
                ans[nums[i]]++;
        }

        for(int i=1;i<ans.length;i++){
            if(ans[i]==0 ){
                result[1]=i;
            } else if (ans[i]==2) {
                result[0]=i;
            }
        }

        return result;
    }
}
