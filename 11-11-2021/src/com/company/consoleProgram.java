package com.company;

import java.util.Scanner;

public class consoleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallestNumber = Integer.MAX_VALUE;
        int largestNumber = Integer.MIN_VALUE;

        while (true) {
            int insertNumber = scanner.nextInt();

            if (insertNumber == 0) {
                break;
            }
            if (insertNumber < smallestNumber) {
                smallestNumber = insertNumber;
            }
            if (insertNumber > largestNumber) {
                largestNumber = insertNumber;
            }
        }
        System.out.println("Най-голямо: " + largestNumber);
        System.out.println("Най-малко: " + smallestNumber);
    }
}


