package com.nextbase.test.axies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Jar {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2}, {2, 3}, {3, 1}, {4, 6}, {5, 8}, {10, 9},{11,5}
        };

        draw(arr);
    }
    public static void draw(int[][] arr) {
        List<int[]> first = Arrays.stream(arr).collect(Collectors.toList());
        List<List<Integer>> list = first.stream().map(
                m -> Arrays.stream(m).boxed().collect(Collectors.toList())
        ).collect(Collectors.toList());

        List<Integer> maxs = maxi(list);
        int maxP = maxs.get(1);
        int maxT = maxs.get(0);

        int mp = maxP;
        int mt = maxT;

        List<List<Integer>> dummy = new ArrayList<>();

        for (int i = 0; i < maxT + 1; i++) {
            if (i == maxT) {
                System.out.print("+");
            } else {
                System.out.print("+---");
            }
        }
        System.out.println();



        for (int i = maxP; i >= 1 ; i--) {
            int[] s = new int[maxT+1];
            System.out.print(i);
            for (List<Integer> each : list) {
                if (each.get(1) == i) {
                    s[each.get(0)] = -1;
                }
            }


            for (int k : s) {
                if (k == -1) {
                    System.out.print("*");
                } else if (k == 0) {
                    System.out.print("    ");
                } else {
                    System.out.print(k);
                }

            }
            System.out.println();
        }

        for (int i = 0; i < maxT + 1; i++) {
            if (i == maxT) {
                System.out.print(i);
            } else {
                System.out.print(i + "---");
            }
        }

    }

    public static List<Integer> maxi(List<List<Integer>> arr){
        int maxPrice = 0;
        int maxTime = 0;
        for (List<Integer> each : arr) {

            if (each.get(1) > maxPrice) {
                maxPrice = each.get(1);
            }
            if (each.get(0) > maxTime) {
                maxTime = each.get(0);
            }
        }

        return new ArrayList<>(Arrays.asList(maxTime, maxPrice));
    }
}
