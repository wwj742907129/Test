package com.company.java8.lambda;

import java.util.Arrays;
import java.util.List;

interface Test {
    int operation(int a,int b);
}

public class Lambda {



    interface Mathoperation{
        int operation(int a,int b);
    }

    interface GreetingServer{
        void print(String message);
    }

    public static void main(String[] args) {



        Mathoperation add = (int a, int b) -> a + b;

        Mathoperation sub = (a,b) -> a - b;

        Test cheng = (x,y)->x*y;

        //没有类型声明的表达式
        GreetingServer printInfo = Info ->System.out.println(Info);
        //也可以写成： (Info) ->System.out.println(Info);

        printInfo.print("10 + 5 ="+operator(10,5,add));

        System.out.println(cheng.operation(1,2));

        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (Object feature : features) {
            System.out.println(feature);
        }
        System.out.println("====");
        features.forEach((feature)-> System.out.println(feature));


//        features.add("hhh");

        int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);  // 输出结果为 3
//        num =2;
    }
    private static int operator(int a,int b,Mathoperation mathoperation){
        return mathoperation.operation(a,b);
    }
    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
