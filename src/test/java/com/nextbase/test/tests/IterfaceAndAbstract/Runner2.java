package com.nextbase.test.tests.IterfaceAndAbstract;

public class Runner2 {
    public static void main(String[] args) {

        Child c = new Child();

        System.out.println("c.defStaString = " + c.defStaString);
        System.out.println("c.proInstString = " + c.proInstString);
        System.out.println("c.methode() = " + c.methode());
        System.out.println("c.print() = " + c.print());
        c.print2();

        c.proInstString = "sara";
        System.out.println("c.proInstString = " + c.proInstString);
        System.out.println(c.inst);

        System.out.println(c.staString);


    }
}
