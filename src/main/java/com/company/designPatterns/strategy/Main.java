package com.company.designPatterns.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[]{new Cat(1,2),new Cat(3,4),new Cat(2,2)};

        Sorter s = new Sorter();

        s.sort(cats);
        System.out.println(cats);
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }

//        int[] a = new int[]{4,8,0,7,1};
//
//        sort(a);
//        System.out.println(a.toString());

        Dog[] dogs = new Dog[]{new Dog(3,3),new Dog(1,1),new Dog(2,2)};

        Dog dog = new Dog(1,2);
        Arrays.sort(dogs,new Dog());

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }

        Dog[] dogs2 = new Dog[]{new Dog(3,3),new Dog(1,1),new Dog(2,2)};

        Sorter2 sorter2 = new Sorter2();
        sorter2.sort(dogs2,new Dog());


        for (int i = 0; i < dogs2.length; i++) {
            System.out.println(dogs2[i]);
        }

    }





}
