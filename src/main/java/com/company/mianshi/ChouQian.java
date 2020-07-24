package com.company.mianshi;

import java.util.Random;

public class ChouQian {

    public static void main(String[] args) {
        //        Random rand = new Random();
        //        for (int i = 0; i < 10; i++) {
        //            System.out.println("di " + i +"ci");
        //            int seed = rand.nextInt(100);
        //            System.out.println(seed);
        //            int num = rand.nextInt(seed);
        //            System.out.println(num);
        //            System.out.println("========");
        //        }
//        System.out.println((0 & 1) == 1);
//        System.out.println((1 & 1) == 1);
//        System.out.println((2 & 1) == 1);
//        System.out.println((3 & 1) == 1);
//        System.out.println((4 & 1) == 1);
        Person p1 = new Person();
        p1.setId("1");
        p1.setFactor(1);
        Person p2 = new Person();
        p2.setId("2");
        p2.setFactor(2);
        Person p3 = new Person();
        p3.setId("3");
        p3.setFactor(3);
        Person p4 = new Person();
        p4.setId("4");
        p4.setFactor(4);
        Person p5 = new Person();
        p5.setId("1");
        p5.setFactor(1);
        Person[] p = new Person[5];
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        p[3] = p4;
        p[4] = p5;
//        getWinners(p, 1);


    }

    public static class Person {
        String id;
        int factor;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getFactor() {
            return factor;
        }

        public void setFactor(int factor) {
            this.factor = factor;
        }
    }

    public String[] getWinners(Person[] persons, int number) {

        Random rand = new Random();
        int seed = rand.nextInt(100);
        int num = rand.nextInt(seed);
        int winnerNum = 0;
        String[] winners = new String[number];

        while (winnerNum < number) {
            for (int i = 0; i < persons.length; i++) {
                int factor = persons[i].getFactor();
                if (num < factor) {
                    if (winnerNum >= number) {
                        break;
                    }
                    winners[winnerNum] = persons[i].getId();
                    winnerNum++;
                }
            }
            System.out.println("当前num为" + num);
            if ((num & 1) == 1) {
                num = (num - 1) / 2;
            } else {
                num = num / 2;
            }
        }
        for (String winner : winners) {
            System.out.println("winer Id is :" + winner);
        }

        return winners;
    }

    private static void getArray(Person[] persons, int num, int winnerNum, String[] winners, int number) {
        for (int i = 0; i < persons.length; i++) {
            int factor = persons[i].getFactor();
            if (num < factor) {
                if (winnerNum >= number) {
                    break;
                }
                winners[winnerNum] = persons[i].getId();
                winnerNum+=1;
            }
        }
    }

}
