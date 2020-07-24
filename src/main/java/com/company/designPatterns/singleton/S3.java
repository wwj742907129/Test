package com.company.designPatterns.singleton;

public class S3 {

    private S3(){

    }

    private  static S3 INSTANCE;

    public static synchronized S3 getInstance() {

        if (INSTANCE == null) {
            return new S3();
        }
        return INSTANCE;
    }




}
