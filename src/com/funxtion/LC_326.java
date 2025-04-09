package com.funxtion;

public class LC_326 {
    public static void main(String[] args) {
        int n=9;                ;
        boolean result=finder(1,n);
        System.out.println(result);
    }

    public static boolean finder(int x,int target){
        if(x==target){
            return true;
        }
        if(x>target){
            return false;
        }

        boolean result =  finder(3*x,target);


        return result;
    }
}
