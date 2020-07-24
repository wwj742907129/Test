package com.company.java8.groupby;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Person {
    
    private Integer id;
    private Integer age;
    private String name;
    private List teachers;

    public Person() {
    }

    public Person(Integer id, Integer age, String name, List teachers) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.teachers = teachers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<String> teachers) {
        this.teachers = teachers;
    }
    @Override
    public String toString() {
        return "Person: id=" + id + "  age = " + age + "  name" +name + "  laoshi =" + teachers.toString();
    }

    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("wwj");
        List<Person> persons = Arrays.asList(
                new Person(1, 10, "a", Arrays.asList("a","b")),
                new Person(2, 10, "b", Arrays.asList("c","d")),
                new Person(3, 10, "c", Arrays.asList("e","f")),
                new Person(4, 10, "d", Arrays.asList("a","c"))
                );
        Map<String ,List<Person>> map =
                persons.stream().collect(Collectors.groupingBy(Person::getName));
        Map<String ,Long> map1 =
                persons.stream().collect(Collectors.groupingBy(Person::getName,Collectors.counting()));
        System.out.println(map);
        System.out.println(map1);
        System.out.println(map.keySet().size());




    }
}
