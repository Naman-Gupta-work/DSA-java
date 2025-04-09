package com.naman;

public class find_rotation_count {

    public static void main(String[] args) {
        int []  arr = {};
        int pos=pivot(arr);
        System.out.println(pos+1);
    }

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

}
