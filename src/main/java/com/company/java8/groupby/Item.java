package com.company.java8.groupby;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Item {

    private String name;

    private int qty;

    private BigDecimal price;

    public Item() {
    }

    public Item(String name, int qty, BigDecimal price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal(23.5)),
                new Item("apple", 20, new BigDecimal(32.5)),
                new Item("orange", 30, new BigDecimal(13.9)),
                new Item("orange", 20, new BigDecimal(32.5)),
                new Item("orange", 10, new BigDecimal(41.5)),
                new Item("orange", 50, new BigDecimal(41.5)),
                new Item("peach", 20, new BigDecimal(32.5)),
                new Item("peach", 20, new BigDecimal(32.5)),
                new Item("peach", 40, new BigDecimal(24.5)),
                new Item("peach", 10, new BigDecimal(12.5))
        );


        // contains

        // 分组
        Map<BigDecimal, List<Item>> groupByPriceMap = items.stream()
                .collect(Collectors.groupingBy(Item::getPrice));
        System.out.println(groupByPriceMap);
        System.out.println("==========");

        // 分组
        Map<String, List<Item>> groupByFruitMap = items.stream()
                .collect(Collectors.groupingBy(Item::getName));
        System.out.println(groupByFruitMap);
        List<Item> result2 = groupByFruitMap.get("A");
        List<Item> result3 = groupByFruitMap.get("apple");

        System.out.println("-----------------");

        for (List<Item> items1 : groupByFruitMap.values()) {
//            System.out.println(items1);
            Map<Integer, List<Item>> groupByQTYMap = items1.stream().collect(Collectors.groupingBy(Item::getQty));
            System.out.println(groupByQTYMap);
        }
        System.out.println("==========");
        // 分组 转化List->Set
        Map<BigDecimal, Set<String>> result = items.stream()
                .collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
        System.out.println(result);
    }
}
