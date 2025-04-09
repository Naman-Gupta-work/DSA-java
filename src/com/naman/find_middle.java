package com.naman;

public class find_middle {
    public static void main(String[] args) {
        int[] arr = { 6,9,0,1,2,4,5};
        int pivot=highest(arr);
        System.out.println(pivot);

    }

    static int highest(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (true) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid + 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }
    }
}