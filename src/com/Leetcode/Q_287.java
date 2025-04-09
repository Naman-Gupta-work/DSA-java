package com.Leetcode;

public class Q_287 {

    public static void main(String[] args) {
        int [] nums={1,4,3,2,2};
        int n = nums.length;
        int[] a = new int[n+1];
        for(int i = 0;i<n;i++){
            a[nums[i]]++;
        }
        for(int i=1;i<=n;i++){
            System.out.println("the element is "+a[i]);
            if(a[i]==0){
                System.out.println(i);
            }
        }
//        return ans;

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
