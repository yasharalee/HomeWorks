package com.nextbase.test.assertion_test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List <List<String>> list = new ArrayList<>();

        list.add(new ArrayList<String>(List.of("salam","khubi")));
        list.add(new ArrayList<String>(List.of("man","hastam")));
        list.add(new ArrayList<String>(List.of("ati","hast")));

        System.out.println(list.get(0).contains("salam"));

    }

}
