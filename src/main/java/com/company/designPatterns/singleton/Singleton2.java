package com.company.designPatterns.singleton;

public class Singleton2 {




    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.s;
    }

    //
    private static class SingletonHolder {
        private static   Singleton2 s= new Singleton2();
    }

}

