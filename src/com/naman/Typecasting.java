package com.naman;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int val=(int)(45.6745f);
        System.out.println(val);


        int a = 257;
        byte b= (byte)(a);
        System.out.println(a);
        System.out.println(b);  // 257 % 256


        int number='A';
        System.out.println(number);
    }
}
