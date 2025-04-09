package com.Bit_manipulation;

public class odd_even {

    public static void main(String[] args) {
    int n=99;
        System.out.println(isodd(n));
//        System.out.println(2^3);
    }

    public static boolean isodd (int n){
        return (n & 1)==1;
    }
}
