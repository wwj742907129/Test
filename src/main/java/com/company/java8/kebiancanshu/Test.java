package com.company.java8.kebiancanshu;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void method(int...arg){
        for(int i=0; i<arg.length; i++)
            System.out.println(arg[i]);
    }

    public static void method2(List<? extends Integer>...arg){
        for(int i=0; i<arg.length; i++)
            System.out.println(arg[i]);
    }

    public static void main(String[] args){
        method(1, 2, 3, 4);

        int[] a={1, 2, 3, 4};
        method(a);//这两种使用方法输出同样的结果，所以不定项参数兼容数组

        List<Integer>  aa = new ArrayList<>();
        aa.add(1);
        aa.add(2);
       List<Integer>  bb = new ArrayList<>();
        bb.add(1);
        bb.add(2);
        method2(aa,bb);
    }
}
