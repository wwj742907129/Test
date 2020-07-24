package com.company.designPatterns.strategy;

import java.util.Comparator;

public class Sorter2<T>  {

    public  void  sort(T[] a, Comparator<T> comparator) {
        T temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (comparator.compare(a[i],a[j]) < 0){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }


    }
}
