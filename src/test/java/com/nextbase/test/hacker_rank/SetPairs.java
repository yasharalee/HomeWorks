package com.nextbase.test.hacker_rank;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetPairs {
    public static void main(String[] args) {


        String[] pair_left = {"john", "john", "john","mary","mary"};
        String[] pair_right = {"tom", "mary", "tom", "anna", "anna"};


        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i < pair_left.length; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }


    }
}
