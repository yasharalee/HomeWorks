package com.nextbase.test.tests.fourth;

public class WhiteBoarding {
    public static void main(String[] args) {
        System.out.println(isprime(8));


    }

    private static boolean isprime(int i) {
        boolean is = true;

        for (int j = 2; j < i; j++) {
            if(i%j == 0){
                is=false;
            }
        }
        return is;
    }


}
