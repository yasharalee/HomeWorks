package com.nextbase.test.utilities;

import com.github.javafaker.Faker;

public class NameGenerator {

    public static Object[][] generate(int n){
        Faker fake = new Faker();
        Object[][] arr2 = new Object[n][1];
        for (int i = 0; i < n; i++) {
            arr2[i][0] = (fake.superhero().name());
        }
        return arr2;
    }

}
