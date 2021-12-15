package com.company;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете страните a, b и c.");
        byte a = scanner.nextByte();
        byte b = scanner.nextByte();
        byte c = scanner.nextByte();

        boolean formula = (a + b > c && b + c > a && a + c > b);
        String areGraterThanZero = (formula && a > 0 && b > 0 && c > 0) ? "Триъгълника съществува" : "Триъгълника не съществува";
        System.out.println(areGraterThanZero);
    }
}

