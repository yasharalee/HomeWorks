package com.nextbase.test.tests.inherit.pack2;

import com.nextbase.test.tests.inherit.pack1.A;
import com.nextbase.test.tests.inherit.pack1.BInPack1;

public class runnerPack2 {
    public static void main(String[] args) {
       // BInPack2 b = new BInPack2();

//        System.out.println(b.pubInst);
//       // System.out.println(b.proInst); No Access to protected
//        System.out.println("BInPack2.pubSta = " + BInPack2.pubSta);
//        System.out.println("b.print() = " + b.print());
//        System.out.println("b.print2() = " + b.print2());
//        b.setProInst("changed");
//        System.out.println(b.print());

        BInPack1 b = new BInPack1();
        System.out.println(b.pubInst);

        A a = new A();



    }
}
