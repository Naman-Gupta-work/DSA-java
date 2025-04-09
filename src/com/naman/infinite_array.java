package com.naman;

public class infinite_array {
    public static void main(String[] args) {

    }
    static int finder(int [] array, int target){
        int start=0;
        int end=1;
        while(target>array[end]){
            int newstart=end+1;
            end=end+(end- start +1 )*2;
            start=newstart;

        }
        return bin_search(array,target,start,end);
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
}
