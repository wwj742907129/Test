package com.company.suanfa.digui;

public class heneita2 {

    static int i= 1;
    public static void main(String[] args) {



    }

//    public static void move(int n,char from,char to,char depend) {
//
//        if (n == 1) {
//            show(n,from,to);
//            return;
//        } else {
//            move(n-1,);
//        }
//
//    }
    public static void show(int n,char from,char to){
        System.out.println("第" + (i++) + "步:" + n + "号盘子" + from + "--------" + to);
        i++;
    }
}
