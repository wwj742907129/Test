package com.company.suanfa.digui;

import java.util.Scanner;

public class heneita {
    static int i = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char from = 'X', depend_on = 'Y', to = 'Z';
        hanoi(n, from, depend_on, to);
    }

    public static void hanoi(int n, char from, char depend_on, char to) {
        if (n == 1) {
            move(n, from, to);
            return;
        } else {
            hanoi(n - 1, from, to, depend_on);//X-----Y
            move(n, from, to);//X-----Z
            hanoi(n - 1, depend_on, from, to);//Y-----Z
        }
    }

    public static void move(int n, char from, char to) {
        System.out.println("第" + (i++) + "步:" + n + "号盘子" + from + "--------" + to);
    }
}
