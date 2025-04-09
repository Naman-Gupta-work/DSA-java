package com.naman;
// accepted :D
public class LC_1011 {
    public static void main(String[] args) {
        int [] weights={3,2,2,4,1,4};
        int days= 3;
        System.out.println(shipWithinDays(weights,days));
    }
    public static int  shipWithinDays(int[] weights, int days) {
        int start=0;
        int end=0;

        for(int i=0;i<weights.length;i++){
            start=Math.max(start,weights[i]);
            end+=weights[i];
        }

        while(start<end){
            int mid= start+(end-start)/2;
            int days_taken=find(weights,mid);

            if(days_taken<=days){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int find(int []weights, int max){
        int capacity=0;
        int days=1;
        for(int i=0;i<weights.length;i++){
            if (capacity+weights[i]<=max){
                capacity = capacity + weights[i];
            }
            else{
                capacity=weights[i];
                days++;
            }
        }
        return days;
    }

}
