package com.company.designPatterns.strategy;

import java.util.Comparator;

public class Dog implements Comparator<Dog> {

    public int HIGHT, WIDTH;

    public Dog() {

    }
    public Dog(int HIGHT, int WIDTH) {
        this.HIGHT = HIGHT;
        this.WIDTH = WIDTH;
    }

//    public int compareTo(Object c) {

//    @Override
//    public int compare(Dog o1, Dog o2) {
//        return 0;
//    }
    //
//        Dog dog = (Dog) c;
//        if (dog.HIGHT < this.HIGHT) return 1;
//        if (dog.HIGHT > this.HIGHT) return -1;
//        return 0;
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "HIGHT=" + HIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }

    @Override
    public int compare(Dog d1, Dog d2) {
        if (d1.WIDTH > d2.WIDTH) return 1;
        if (d1.WIDTH < d2.WIDTH) return -1;
        return 0;
    }
}
