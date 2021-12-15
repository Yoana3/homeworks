package com.company;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] triangle = new int[n][n + 2];


        for (int rows = 0; rows <= n; rows++) {
            for (int columns = 0; columns<=rows+2; columns++) {
                for (int stars=0;stars<=rows;stars++) {
                    if (columns < stars) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}

