package com.company;

import java.util.Scanner;

public class numberThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = 8;
        float b = 4;
        int option = scan.nextInt();
        switch (option) {
            case 1 -> {
                float sum = a + b;
                System.out.println(sum);
            }
            case 2 -> {
                float subtraction = a - b;
                System.out.println(subtraction);
            }
            case 3 -> {
                float subtractionWithOne = b - 1;
                System.out.println(subtractionWithOne);
            }
            case 4 -> {
                float multiplication = a * b;
                System.out.println(multiplication);
            }
            case 5 -> {
                float divisionAtoB = a / b;
                System.out.println(divisionAtoB);
            }
            case 6 -> {
                float divisionBtoA = b / a;
                System.out.println(divisionBtoA);
            }
            default -> System.out.println("Опцията не е намерена");
        }

    }
}
