package com.Leetcode;

public class Q_1342 {

    public static void main(String[] args) {
        numberOfSteps(14);
    }

    public static int numberOfSteps(int num) {

        System.out.println( countsteps(num,0) );
        return 1;
    }

    public static int countsteps(int n, int count){

        if (n==0){
            return count;
        }
        if(n%2==0){
            count++;
            return countsteps(n/2,count);
        }
        count++;
        return countsteps(--n,count);

    }
}
