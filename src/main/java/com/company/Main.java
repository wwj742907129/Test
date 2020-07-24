package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Map<Integer, String> test = new HashMap<>();
        Integer i = -1;
        System.out.println(i);
        test.put(1,"A");
        test.put(3,"b");
        test.put(2,"c");
        test.put(10,"b");
        test.put(2,"bb");
        System.out.println(test);

        System.out.println("----");

        System.out.println(test.keySet());
        System.out.println("----");
        System.out.println(test.values());

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        Integer[] a = new Integer[10];
        a = set.toArray(a);
    }
}
