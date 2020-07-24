package com.company.ascii;

public class SwitchTest {

    public static void main(String[] args) {

        System.out.println(translateConfigurationLevel(null));

    }

    public static String translateConfigurationLevel(Integer level) {
        String name;
        switch (level) {
            case 0:
                name = "标配";
                break;
            case 1:
                name = "特配";
                break;
            default:
                name = "";
                break;
        }
        return name;
    }
}
