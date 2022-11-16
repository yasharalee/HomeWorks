package com.nextbase.test.random_practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {

        String s = "Wooden spoon";

        //reverse(s);
      // rev(s);
        StringBuilder d = new StringBuilder(s);
        System.out.println(d.reverse());

//        int e = 9;
//        System.out.println(e<<1);
        StringMan f = new StringMan("woodenSpoon");
        System.out.println(f.subString(5, 8));
        System.out.println(f.subString(6));


    }

    public static void rev(String str){

        List<String> d = Stream.of(str).unordered().collect(Collectors.toList());
        System.out.println(d);
    }

    public static void reverse(String str){
        String dummy ="";

        for (int i = str.length()-1; i >=0  ; i--) {
            dummy += "" + str.charAt(i);
        }
        System.out.println(dummy);
    }

}
