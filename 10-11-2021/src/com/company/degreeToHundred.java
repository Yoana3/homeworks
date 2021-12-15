package com.company;

import java.util.Scanner;

public class degreeToHundred {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        long counter = 0;
        long sum = 1;
        while (sum <= 1000) {
            System.out.println(sum);
            sum = sum * number;
            counter++;
        }
    }
}
