package com.naman;

import java.util.Arrays;

public class LC_401 {

    public static void main(String[] args) {
        int [] arr= {7,2,5,10,8};
//        int pieces=count_pieces(arr,6);
        System.out.println(splitArray(arr,2));

    }

    public static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            end+=nums[i];
            start=Math.max(start,nums[i]);
        }
        System.out.println(start+ " "+ end);
        return binary_search(nums,start,end,k);

    }



    public static int binary_search(int [] nums, int start, int end , int m){

        while(start<end){
            int mid= start + ( end- start) /2;
            int pieces=count_pieces(nums,mid);
            System.out.println(pieces+ " "+ mid);
            if( pieces<=m){
                end = mid;
            }else{
                start=mid+1;
            }
        }
    return start;

    }


    public static int count_pieces (int [] nums,int max){
            int count=0;
            int piece=1;
            for(int i=0;i<nums.length;i++){
                if(count+nums[i]<=max){
                    count=count+nums[i];

                }
                else{

                    count=nums[i];
                    piece++;
                }
            }
            return piece;
    }


}
