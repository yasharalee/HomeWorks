package com.nextbase.test.random_practice;

public class StringMan {
    String a ;
    public StringMan(String str){
        a = str;
    }



    public String subString(int i, int k){
        String dum = "";
        for (int j = i; j < k; j++) {
            dum += "" + a.charAt(j);
        }
        return dum;
    }

    public String subString(int i){
        String dum = "";
        for (int j = i; j < a.length(); j++) {
            dum += "" + a.charAt(j);
        }
        return dum;
    }

}
