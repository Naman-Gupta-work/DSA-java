package com.algos;

import java.util.Arrays;

public class cyclic_sort {

    public static void main(String[] args) {
        int [] arr= {1,3,4,2,2};
        sort(arr);
        System.out.println(Arrays.toString(arr) );
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
