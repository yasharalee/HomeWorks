package com.nextbase.test.random;

import java.util.Arrays;

public class RegexPicker {
    public static void main(String[] args) {
        String[] pt1 = "DC501GCCCA098911".split("((?<=[a-z])(?=[0-9]))|((?<=[0-9])(?=[a-z]))");

        String[] pt2 = "DC501GCCCA098911".split("((?=[a-z])(?<=[A-Z])(?<=[a-z])(?=[0-9]))|((?<=[0-9])(?=[a-z]))");

        System.out.println(Arrays.toString(pt1));
        System.out.println(Arrays.toString(pt2));

    }
}
