package com.nextbase.test.assertion_test;

import java.util.ArrayList;
import java.util.List;

public class AssertionTest {
    public static void main(String[] args) {

        String thi = "C:\\Users\\yasha\\OneDrive\\Desktop\\Java\\trycloud\\src\\test\\resources\\UpldedFiles\\oregon.jpeg";

       System.out.println(thi.replace("\\","/"));



        List<String> ab = new ArrayList<>();
        ab.add("a");
        ab.add("c");
        ab.add("d");
        ab.add("e");
        ab.add("f");
        System.out.println(ab.contains("s"));

        System.out.println(ab.indexOf("c"));
        System.out.println(ab.size());
        System.out.println(ab.get(4));
        String d = " ";
        System.out.println( "blank =" + d.isBlank());
        System.out.println("isEmpty=" + d.isEmpty());

    }
}
