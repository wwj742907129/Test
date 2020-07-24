package com.company.ascii;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {

//        String str = "{name:1234,password:4444}";
        String str = "M3A-";
        String asciiResult = stringToAscii(str);
        System.out.println(asciiResult);
        String stringResult = asciiToString(asciiResult);
        System.out.println(stringResult);
        System.out.println("--------------");
        String str2 = "M2AM";
        System.out.println(str2.length());
        str2 = str2.replace("M","");
        System.out.println(str2);
        System.out.println(str2.length());
        String str3 = "3";
        System.out.println(str3.charAt(0));
        System.out.println((int)str3.charAt(0));
        System.out.println("---------------");
        int[] a = new int[3];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        for (int i = a.length-1; i >= 0 ; i--) {
//            if (a[i] == 1){
//                continue;
//            }
            System.out.println(a[i]);
        }
        System.out.println("---------------");
        List list = new ArrayList();
        list.add(0);
        list.add(1);
        list.add(2);
        for (int i = list.size() -1 ; i >=0 ; i--) {
            if ((int)list.get(i) == 1){
                list.remove(i);
                continue;
            }
            System.out.println(list.get(i));
        }
    }

    public static String stringToAscii(String value)
    {
        StringBuffer sbu = new StringBuffer();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1)
            {
                sbu.append((int)chars[i]).append(",");
            }
            else {
                sbu.append((int)chars[i]);
            }
        }
        return sbu.toString();
    }

    public static String asciiToString(String value)
    {
        StringBuffer sbu = new StringBuffer();
        String[] chars = value.split(",");
        for (int i = 0; i < chars.length; i++) {
            sbu.append((char) Integer.parseInt(chars[i]));
        }
        return sbu.toString();
    }
}
