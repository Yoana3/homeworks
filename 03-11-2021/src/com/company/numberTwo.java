package com.company;

import java.util.Scanner;

public class numberTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte points = scan.nextByte();
        switch (points) {
            case 1 -> System.out.println(points * 10);
            case 2 -> System.out.println(points * 10);
            case 3 -> System.out.println(points * 10);
            case 4 -> System.out.println(points * 100);
            case 5 -> System.out.println(points * 100);
            case 6 -> System.out.println(points * 100);
            case 7 -> System.out.println(points * 1000);
            case 8 -> System.out.println(points * 1000);
            case 9 -> System.out.println(points * 1000);
            default -> System.out.println("Error!");
        }
    }
}

