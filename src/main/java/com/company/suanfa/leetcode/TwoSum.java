package com.company.suanfa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {


        Double x = Math.pow(10,2);

        Integer s = x.intValue();

        int s1 = 221/10;
        int s2 = 221%10;
        System.out.println(s1);
        System.out.println(s2);

       int[] nums =new int[]{-1,-2,-3,-4,-5,-6};
       int[] result ;
       result = twoSum(nums, -8);
        System.out.println(result);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int value;
        for (int i = 0; i < nums.length; i++) {
            value = target - nums[i];
            if (map.containsKey(value) && map.get(value) != i) {
                return new int[] {i, map.get(value)};
            }
        }
        return null;
    }
}
