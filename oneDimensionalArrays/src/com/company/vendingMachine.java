package com.company;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Въведи името си:");
            String name = scan.nextLine();
            System.out.println("Въведи години:");
            int age = scan.nextInt();
            if (age < 18) {
                System.out.println("Не може да бъдете обслужен");
            } else {
                System.out.println("Избери 1 за цигари и 2 за алкохол:");
                int userChoice = scan.nextInt();
                switch (userChoice) {
                    case 1 -> System.out.println("Консумирай с удоволствие и мярка, " + name);
                    case 2 -> System.out.println("Пушенето убива, " + name);
                    default -> System.out.println("Грешен избор");
                }
            }

        }
    }
}

