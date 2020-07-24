package com.company.designPatterns.singleton;

public class S5 {

    private S5() {
    }

    private volatile static S5 INSTANCE;

    public static S5 getInstance() {

        if (INSTANCE == null) {
            synchronized(S5.class) {
                if (INSTANCE == null) {
                    return new S5();
                }
            }
        }
        return INSTANCE;
    }

}
