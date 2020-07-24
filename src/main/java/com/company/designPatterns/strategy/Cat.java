package com.company.designPatterns.strategy;

public class Cat implements java.lang.Comparable {

    public int HIGHT, WIDTH;

    public Cat(int HIGHT, int WIDTH) {
        this.HIGHT = HIGHT;
        this.WIDTH = WIDTH;
    }

    @Override
    public int compareTo(Object c) {

        Cat cat = (Cat) c;
        if (cat.HIGHT < this.HIGHT) return 1;
        if (cat.HIGHT > this.HIGHT) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "HIGHT=" + HIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
