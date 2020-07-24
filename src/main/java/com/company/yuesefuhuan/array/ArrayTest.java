package com.company.yuesefuhuan.array;

import java.util.ArrayList;

public class ArrayTest {

    public static void main(String[] args) {

        int total = 10;
        int killNumber = 3;
        int p = 0;
        ArrayList<Integer> list = new ArrayList(total);
        for (int i = 0;i<total;i++) {
            list.add(i);
        }

        for (int i=1;i <= killNumber; i++) {

            if (list.size() == 1) {
                break;
            }
            if (p>list.size() -1) {
                p = 0;
            }
            if (i == killNumber) {
                System.out.println("删除"+list.get(p));
                list.remove(p);
                i = 1;
//                p--;
            }
            p++;

        }
        System.out.println(list.get(0));
    }

//    public static void main(String[] args) {
//
//        int total = 10;
//        int killNumber = 2;
//
//        ArrayList<Integer> arr = new ArrayList<>(10);
//        for (int i =0;i<10;i++) {
//            arr.add(i);
//        }
//        int k = 0;
//
//        for (int i = 0;i <= killNumber; i++) {
//
//            if (k >= arr.size()) {
//                k = 0;
//            }
//            if (i == killNumber) {
//                i = 0;
//                System.out.println(arr.get(k));
//                arr.remove(k);
//
//            }
//            k++;
//            if (arr.size() == 1) {
//                break;
//            }
//        }
//        System.out.println(total + "个人"+ " 每次报数为" + (killNumber+1) +" 最后活下来的是" + (arr.get(0)+1));
//    }




}
