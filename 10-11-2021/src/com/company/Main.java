package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a number:");
        long number = scan.nextLong();
        System.out.println("Insert a degree:");
        long degree = scan.nextLong();
        long counter = 1;
        long sum = 1;
        while (counter <= degree) {
            sum = sum * number;

            counter++;
        }
        System.out.println(sum);
    }
}
