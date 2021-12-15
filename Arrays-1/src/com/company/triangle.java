package com.company;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] triangle=new int[n][n*2+1];
        for (int row = 0; row < triangle.length; row++) {
            for (int col = 0; col < (row * 2) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
