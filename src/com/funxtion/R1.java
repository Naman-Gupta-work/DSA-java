package com.funxtion;

import javax.sound.sampled.Line;

public class R1 {
    public static void main(String[] args) {

        int [] arr={1,2,6,5};
        System.out.println(is_sorted(arr,0));
        System.out.println(Linear_search(arr,10,0));
//        System.out.println(palindrome(11331));
    }

    public static void fun1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        n-=1;
        fun1(n);
    }

    public static void func2(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        func2(n-1);
        System.out.println(n);
    }

    public static int factorial(int n){

        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }

        return n+sum(n-1);
    }

    public static int sumofdigits(int n){
        int digit=n%10;
        int number=n/10;

        if(number<10){
            return digit+number;
        }
//        System.out.println(digit+" "+number);
        return digit+sumofdigits(number);
    }

    public static int reverse(int n, int reversed  ){

        int digit=n%10;
        int number=n/10;
        reversed=reversed*10+digit;
        if(number==0){
            return reversed;
        }
        return reverse(number,reversed);
    }

    public static boolean palindrome(int n){
        return n==reverse(n,0) ;
    }


    public static boolean is_sorted(int [] arr, int index){

        if(arr.length-1==index){
            return true;
        }
        return arr[index]<arr[index+1] && is_sorted(arr,index+1);
    }

    public static boolean Linear_search(int [] arr, int target, int index){

        if(arr[index]==target){
            return  true;
        }
        if(index==arr.length-1){
            return false;
        }

        return arr[index]==target || Linear_search(arr,target,index+1);
    }
}
