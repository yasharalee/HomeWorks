package com.nextbase.test.tests.inherit.pack1;

public class runnerPack1 {
    public static void main(String[] args) {
        BInPack1 b = new BInPack1();
        System.out.println(b.pubInst);
        System.out.println(b.proInst);
        System.out.println(b.defInst);
        System.out.println(BInPack1.pubSta);
        BInPack1.pubSta = "changed";
        System.out.println(BInPack1.pubSta);
        System.out.println(A.pubSta);
        b.setDefInst("changed2");
        System.out.println(b.defInst);
    }
}
