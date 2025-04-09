package com.naman;

public class Binary_search {

    public static void main(String[] args) {
        int [] arr={1,2,3,};

        int target =24;



    }

    static int bin_search(int [] arr, int target){
        int start=0;
        int end=arr.length-1;

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


}
