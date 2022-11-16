package com.nextbase.test.utilities;

import java.util.*;

public class  Utilities {

    public static <E> Map<E,Integer> mostRepeated(List<E> list){

        Map<E, Integer> f = new HashMap<>();

        int m = 0;

        for (E each : list) {
            if (!f.containsKey(each)) {
                int freq = Collections.frequency(list, each);
                if (freq > m) {
                    m = freq;
                    f.clear();
                    f.put(each, freq);
                }
            }
        }
        return f;
    }

    public static <E> Map<E,Integer> mostRepeated(E[] arr){
        List<E> ps = new ArrayList<>();



        Map<E, Integer> f = new HashMap<>();

        int m = 0;

        for (E each : arr) {

            if (!f.containsKey(each)) {
                int freq = Collections.frequency(ps, each);
                if (freq > m) {
                    m = freq;
                    f.clear();
                    f.put(each, freq);
                }
            }
        }
        return f;
    }




}
