package com.company;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long inputYear = scan.nextLong();
        System.out.println(calculatingIsItLeapYear(inputYear));
    }

    public static boolean calculatingIsItLeapYear(long year) {
        boolean isItLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        return isItLeapYear;
    }
}
