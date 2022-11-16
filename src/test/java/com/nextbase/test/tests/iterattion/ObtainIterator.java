package com.nextbase.test.tests.iterattion;

import java.util.*;

public class ObtainIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "apple", "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange", "apple", "date", "date", "date", "date", "date", "date"));

       // Set<String> set = new HashSet<>(list);

        Iterator it = list.iterator();

        while (it.hasNext()){
            if (it.next().equals("apple")){
                it.remove();
            }
        }
        System.out.println(list);

    }
}
