package com.nextbase.test.tests.inherit.pack2;

import com.nextbase.test.tests.inherit.pack1.A;

public class BInPack2 extends A {

    public String print(){
        return proInst;
    }



    public void setProInst(String str){
        proInst = str;
    }

    public String print2(){
        return proStat;
    }

}
