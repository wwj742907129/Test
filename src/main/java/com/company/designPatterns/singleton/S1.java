package com.company.designPatterns.singleton;

public class S1 {



    private S1(){

    }
    private static S1 INSTANCE = new S1();

    public static S1 getINSTANCE() {
        return INSTANCE;
    }


}

