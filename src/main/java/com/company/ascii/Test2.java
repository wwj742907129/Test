package com.company.ascii;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(getEmployeeLevel());
    }

    public static int getEmployeeLevel() {
        String empLevel = "M3";
        if (empLevel.startsWith("M")) {
            if (empLevel.length() < 2) {
                // 如果出现M开头但是长度异常的，按照小于M3A的处理
                return 0;
            }
            if (empLevel.length() > 2) { // M11这种直接
                return 1;
            }
            if (empLevel.length() == 2) {
                empLevel = empLevel.replace("M", "");
                int asciiThree = (int) empLevel.charAt(0);
                if (asciiThree > 51) { // 3的ascii为51
                    return 1;
                } else if (asciiThree == 51) {
                    int asciiMinorLevel = (int) "A".charAt(0);
                    // - 最小 ascii 45；A的ascii 65；B的为66；
                    return asciiMinorLevel >= 65 ? 1
                            : 0;
                } else {
                    return 0;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }
}
