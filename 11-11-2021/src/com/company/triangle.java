package com.company;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthOfSide = scan.nextInt();

        for (int i = 1; i <= lengthOfSide; i++) {
            for (int space = 1; space <= lengthOfSide - i; space++) {
                System.out.print(" ");
            }
            for (int symbol = 1; symbol <= (2 * i) - 1; symbol++) {
                System.out.print("O");
            }
            System.out.println();
        }
    }
}
