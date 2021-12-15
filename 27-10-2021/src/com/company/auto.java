package com.company;

import java.util.Scanner;

public class auto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double age = scan.nextDouble();
        double price = scan.nextDouble();

        String isHighClass = age > 5 && price > 20000 || age <= 5 && price > 40000 ? "Висок клас" : "Не е висок клас";
        System.out.println(isHighClass);
    }
}
