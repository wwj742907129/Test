package com.company.suanfa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    static List<Integer> list;
    public static void main(String[] args) {

        int[] a = new int[]{9};
        int[] b = new int[]{9,9,9,9,9,9,9,9,9,1};

        Integer i = new Integer("9999999991");

        System.out.println(i);
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);
        // 342 + 654 = 996

        ListNode res = addTwoNumbers(l1,l2);
        System.out.println(res);

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {



            list = new ArrayList<>();
            int a1 = getNumber(l1);
            list = new ArrayList<>();
            int a2 = getNumber(l2);
            Integer a3 = a1 +a2;
            return setNumber(a3);
        }
        public static ListNode setNumber(Integer result){

            int a = result/10;
            int b = result%10;
            ListNode l = new ListNode(b);
            if (a != 0) {
                l.next = setNumber(a);
            }
            return l;
        }

        private static Integer getNumber(ListNode l) {

            if (l != null) {
                list.add(0,l.val);
                getNumber(l.next);
            } else {
                System.out.println("l == null ");
            }


            StringBuffer sb1 = new StringBuffer();
            for (Integer a : list){
                sb1.append(a);
            }
            return new Integer(sb1.toString());
        }

}
