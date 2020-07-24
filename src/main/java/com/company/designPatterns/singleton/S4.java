package com.company.designPatterns.singleton;

public class S4 {

    private S4() {

    }

    private static S4 INSTANCE;

    public static S4 getInstance() {

        if (INSTANCE == null) {
            synchronized(S4.class) {
                return new S4();
            }
        }
        return INSTANCE;
    }

}
