package com.nextbase.test.hacker_rank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    Locale locale = new Locale("en", "in");

    NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(locale);
    NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);


    String us = usFormat.format(payment);
    String india = indiaFormat.format(payment);
    String china = chinaFormat.format(payment);
    String france = franceFormat.format(payment);

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
}




}
