package com.company;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long inputNumber = scan.nextLong();
        long sum = 0;
        long counter = inputNumber - 1;
        while (counter > 0) {
            if (inputNumber % counter == 0) {
                sum += counter;//sum = sum + counter
            }
            counter--;
        }
        if (sum == inputNumber) {
            System.out.println("It is perfect!");
        } else {
            System.out.println(inputNumber + "is not perfect!");
        }

    }
}
