package com.naman;
// ceiling problem
public class LC_744 {
    public static void main(String[] args) {

    }

    static int ceiling(int [] arr, int target){
//        if(target>arr[arr.length-1]){
//            return -1;
//        }

        int start =0;
        int end =arr.length-1;

        while(start<=end){
            int mid= start +(end-start)/2;

            if (target < arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
//            else{
//                return mid;
//            }
        }

        return arr[start%arr.length];

    }
}
