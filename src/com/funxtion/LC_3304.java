package com.funxtion;

public class LC_3304 {

    public static void main(String[] args) {
            String s="a";
            int k = 10;
            String result=returner(s,k);
            System.out.println(result.charAt(k-1));

    }

    public static String returner(String s, int k) {

        if (s.length() >= k) {
            return s;
        }
//        System.out.print("returner>");
        s=appender(s);
        String result = returner(s,k);

        return result;
    }


    public static String appender(String s){
//        System.out.println("inside appender");
        int len=s.length();
        char next;
        for(int i=0; i< len ;i++){
            char a=s.charAt(i);
            if(a=='z'){
                next='a';
            }else{
                next=(char)(a+1);
            }
//            System.out.println(a+" "+next);
            s=s+next;
        }
//        System.out.println(s);
        return s;
    }
}