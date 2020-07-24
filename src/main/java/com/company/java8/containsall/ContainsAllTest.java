package com.company.java8.containsall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsAllTest {

    public static void main(String[] args) {

        List<Integer> aa = Arrays.asList(1,2,3,4,5);

        List<Integer> bb = Arrays.asList(1,2,3,4,5);

        System.out.println("相同时：" + aa.containsAll(bb));

        bb = Arrays.asList(1,2,5);
        System.out.println("包含时：" +aa.containsAll(bb));

        bb = Arrays.asList(1,2,6);
        System.out.println("不包含时：" +aa.containsAll(bb));

        bb = Arrays.asList(1,1,5);
        System.out.println("包含且有重复数据时：" +aa.containsAll(bb));

        System.out.println("===============");
        List<String> cc = Arrays.asList("a","b","c");

        List<String> dd = Arrays.asList("a","b","c");

        System.out.println("相同时：" + cc.containsAll(dd));

        dd = Arrays.asList("a","c");
        System.out.println("包含时：" +cc.containsAll(dd));

        dd = Arrays.asList("a","b","d");
        System.out.println("不包含时：" +cc.containsAll(dd));

        dd = Arrays.asList("a","a","c");
        System.out.println("包含且有重复数据时：" +cc.containsAll(dd));

//        dd = Arrays.asList("a","a","c");
//        System.out.println("包含null：" +cc.containsAll(null));

        class Student {
            List<Integer> sources;
            Integer age;
            String name;

            public List<Integer> getSources() {
                return sources;
            }

            public void setSources(List<Integer> sources) {
                this.sources = sources;
            }

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Student() {
                sources = new ArrayList<>();
                sources.add(1);
                sources.add(2);
                age = 10;
                name = "wwj";
            }
        }
        Student st = new Student();
        st.getSources().add(3);
        System.out.println(st.getSources());


        List<Integer> a = new ArrayList<>();
        a.add(null);
        System.out.println();
    }


}
