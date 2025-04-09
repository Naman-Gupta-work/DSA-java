package com.naman;

public class LC_33 {
    public static void main(String[] args) {
        int[] arr = { 6,9,0,1,2,4,5};
        int target=5;
        System.out.println(search(arr,target));
    }



    static int bin_search(int [] arr, int target,int start, int end){


        while(start<=end){
            int mid =start +(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            } else if (arr[mid] > target ) {
                end=mid-1;

            }else{
                return mid;
            }
        }
        return -1;
    }



    public static int search(int[] nums, int target) {
            int pivot=pivot(nums);
//        System.out.println(pivot);
            if (pivot == -1){
                return bin_search(nums,target,0,nums.length-1);
            }
            if(nums[pivot] == target ){
                return pivot;
            }
            if(target>=nums[0]){
                return bin_search(nums,target,0,pivot-1);
            }
            else{
                return bin_search(nums,target,pivot+1,nums.length-1);
            }
    }




// not work for duplicate values
    
    static int pivot(int [] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start  && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

//    static int pivotwithDuplicates(int [] arr){
//        int start=0;
//        int end= arr.length-1;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if(mid>start  && arr[mid-1]>arr[mid]){
//                return mid-1;
//            }
//            if(arr[mid]<=arr[start]){
//                end=mid-1;
//            }
//            else{
//                start=mid+1;
//            }
//        }
//        return -1;
//    }
}
