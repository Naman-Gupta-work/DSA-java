package com.Bit_manipulation;

public class Findunique {
    public static void main(String[] args) {
        int [] arr={1,2,2,1,3,5,4,3,4};

        System.out.println("the unique is "+ XOR(arr));
    }

    public static int XOR(int [] arr){
        int unique=0;

        for(int n: arr){
            System.out.print("the XOR of "+n+" and "+unique+" is ");
            unique^=n;
            System.out.println(unique);

        }
        return unique;
    }
}
