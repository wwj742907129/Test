package com.company.NiuKe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        ArrayList<Integer> list = printListFromTailToHead2(listNode);
        for (Integer i: list) {
            System.out.println(i);
        }
    }



    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();

        while (listNode != null) {
            list.add(0,listNode.val);
            listNode = listNode.next;
        }
        return list;
//        ListIterator<Integer> listIterator = list.listIterator();
//        while (listIterator.hasNext()){
//            listIterator.next();
//        }
//        while (listIterator.hasPrevious()){
//            list2.add(listIterator.previous());
//        }
//        return list2;
    }

    public static ArrayList<Integer> list = new ArrayList();
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead2(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}
