package com.company.designPatterns.singleton;

public class S6 {

    private S6(){}

    public static S6 getInstance() {
        return Inner.INSTANCE;
    }

    private static class Inner {
        private static S6 INSTANCE = new S6();
    }



}

