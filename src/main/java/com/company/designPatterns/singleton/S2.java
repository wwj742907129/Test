package com.company.designPatterns.singleton;

public class S2 {

    private S2(){

    }

    private  static S2 INSTANCE;

    public static S2 getInstance() {

        if (INSTANCE == null) {
            return new S2();
        }
        return INSTANCE;
    }




}
