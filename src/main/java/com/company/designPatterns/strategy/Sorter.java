package com.company.designPatterns.strategy;

public class Sorter {

    public static void  sort(Cat[] a) {
        Cat temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                //                if (a[i] > a[j]){
                //                    temp = a[i];
                //                    a[i] = a[j];
                //                    a[j] = temp;
                //                }
                if (a[i].compareTo(a[j]) > 0){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }


    }
}
