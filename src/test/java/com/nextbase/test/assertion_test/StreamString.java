package com.nextbase.test.assertion_test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamString {
    public static void main(String[] args) {
        String h = "salam,cheguneei";
        Stream.of(h.split(""));
        String[] e = h.split("");
        System.out.println(Arrays.asList(e));
        System.out.println(String.join("-", e));


    }
}
