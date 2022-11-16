package com.nextbase.test.axies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Axis {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2}, {2, 3}, {3, 1}, {4, 6}, {5, 8}, {10, 9}
        };

        draw(arr);
    }

    public static void draw(int[][] arr){
       List<int[]> first = Arrays.stream(arr).collect(Collectors.toList());
       List<List<Integer>> list = first.stream().map(
               m -> Arrays.stream(m).boxed().collect(Collectors.toList())
       ).collect(Collectors.toList());

       List<Integer> maxs = maxi(list);
       int maxTime = maxs.get(0);
       int maxPrice = maxs.get(1);

        for (int i = 0; i < maxTime + 1; i++) {
            if (i == maxTime) {
                System.out.print("+");
            } else {
                System.out.print("+---");
            }
        }
        System.out.println();
        List<List<Integer>> list2 = new ArrayList<>(list);
        int mt = maxTime;
        int mp = maxPrice;
        int tracker = maxPrice;
        List<List<Integer>> dum = new ArrayList<>();

        for (int i = 0; i < maxPrice; i++) {
            int[] dot = new int[maxTime+2];
            dot[0] = tracker--;
            for (List<Integer> each : list2) {
                if (each.get(1) == mp && !dum.contains(each)){
                    dot[each.get(0)] = -1;
                   dum.add(each);
                    List<List<Integer>> p = list2.stream().filter(m-> !dum.contains(m)).collect(Collectors.toList());
                    List<Integer> mm = maxi(p);
                    mp = mm.get(1);
                    mt = mm.get(0);

                }
            }
            for (int s : dot) {
                if (s == -1 ){
                    System.out.print("*");
                }else if (s == 0 ){
                    System.out.print("    ");
                }else {
                    System.out.print(s+"    ");
                }
            }
            System.out.println();
        }



        for (int i = 0; i < maxTime + 1; i++) {
            if (i == maxTime) {
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
/*


                for (int j = 0; j < arr.length; j++) {
                    if (arr[j][1] == maxPrice) {
                        System.out.print("*");
                    } else {
                        System.out.print("    ");
                    }
                }
 */

/*
public static void draw(int[][] arr) {
        int maxPrice = 0;
        int maxTime = 0;
        for (int[] each : arr) {
            if (each[1] > maxPrice) {
                maxPrice = each[1];
            }
            if (each[0] > maxTime) {
                maxTime = each[0];
            }
        }
        int[][] arr2 = new int[maxTime][2];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        for (int i = 0; i < maxTime + 1; i++) {
            if (i == maxTime) {
                System.out.print("+");
            } else {
                System.out.print("+---");
            }
        }
        System.out.println();


        int mt = maxTime;
        int mp = maxPrice;
        //{1,2}, {2,3},{3,1},{4,6},{5,8},{10,9}


        for (int t = 0; t < mt; t++) {
            System.out.print(maxPrice + "   ");
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < arr2.length; j++) {
                int[] tem = arr2[j];
                if (arr[j][1] == maxPrice) {
                    System.out.print("*");
                    int[] mm = maxi( Arrays.stream(arr2).filter(m -> m[1]!= maxPrice).toArray());
                    maxTime = mm[0];
                    maxPrice= mm[1];
                } else {
                    System.out.print("    ");
                }
            }



            System.out.println();
        }


        for (int i = 0; i < maxTime + 1; i++) {
            if (i == maxTime) {
                System.out.print(i);
            } else {
                System.out.print(i + "---");
            }
        }
 */
/*


        for (int i = 0; i < maxTime; i++) {
            int[] dot = new int[maxTime+1];
           dot[0] = tracker--;
            for (List<Integer> each : list) {
             if (!dum.contains(each)){
                 if (each.get(1) == mp){
                     dot[each.get(0)] = -1;
                     list2.removeIf(m->m == each);
                     List<Integer> mm = maxi(list2);
                     mt = mm.get(0);
                     mp = mm.get(1);
                     dum.add(each);
                 }
             }
            }
            for (int s : dot) {
                if (s == -1 ){
                    System.out.print("*");
                }else if (s == 0 ){
                    System.out.print("    ");
                }else {
                    System.out.print(s+"    ");
                }
            }
            System.out.println();
        }
 */