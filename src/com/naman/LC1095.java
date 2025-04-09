package com.naman;

public class LC1095 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,10,3,1};
        int target=3;
        int index=peakIndexInMountainArray(arr);
        int x=bin_search(arr,0,index, target);
        int y=bin_search(arr,index,arr.length-1, target);
        System.out.println(x );
        System.out.println(y);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {    // ascending part of array look at RHS
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {   // decreasing part of array look at LHS
                end = mid;
            } else {
                if (start == end) {
                    return start;
                }
            }
        }
        return end;
    }


    static int bin_search(int [] arr,int start, int end, int target){

        boolean i = arr[start]<arr[end];

        while(start<=end){
            int mid =start +(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(i){
                if(target<arr[mid]){
                    end=mid-1  ;
                }
                else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                    }
                }
            }
        return -1;
        }

    }

