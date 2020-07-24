package com.company.java8.yinyong;

import java.util.function.Supplier;

public class TestSupplier {


    static int i;
    static Integer ii;

    static Byte b;
    static Short s;
    static Long l;
    static Character c;
    static Float f;
    static Double d;

    public TestSupplier () {
        System.out.println("Byte" + b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
    }

    public static void main(String[] args) {

        Supplier<TestSupplier> testSupplierSupplier = TestSupplier :: new;
        testSupplierSupplier.get();
    }
}
