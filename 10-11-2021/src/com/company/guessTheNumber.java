package com.company;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int random = randomNumber.nextInt(20) + 1;
        Scanner scan = new Scanner(System.in);
        int numberFroTheConsole = scan.nextInt();
        while (random != numberFroTheConsole) {
            numberFroTheConsole = scan.nextInt();
            if (numberFroTheConsole > random) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Too low, try again!");
            }
        }
        System.out.println("You guessed right," + numberFroTheConsole + "is the correct number”,");
    }
}
