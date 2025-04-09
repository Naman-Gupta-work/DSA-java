package com.naman;

public class LC_852 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        int index = peakIndexInMountainArray(arr);
        System.out.println(index);
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
}