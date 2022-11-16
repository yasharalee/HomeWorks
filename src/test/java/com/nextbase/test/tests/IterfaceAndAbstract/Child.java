package com.nextbase.test.tests.IterfaceAndAbstract;

public class Child extends AnAbstract implements AIterface{

    @Override
    String print() {
        return "print from child";
    }

    @Override
    void print2() {
        System.out.println("print2 method in child");
    }

    @Override
    public String methode() {
        return "String method from child";
    }



}
