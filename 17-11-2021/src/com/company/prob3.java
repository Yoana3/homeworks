package com.company;

import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int probablyMagicNumber[][] = new int[4][4];
        int row = 0;
        int col = 0;
        int diagonal = 0;
        int secondDiagonal = 0;
        int thirdDiagonal = 0;
        int forthDiagonal = 0;
        int result = 0;
        for (row = 0; row < 4; row++) {
            for (col = 0; col < 4; col++) {
                System.out.print("Въведете числа["+row+"]["+col+"]");
                probablyMagicNumber[row][col] = scanner.nextInt();
            }
        }
        System.out.println("Вашият квадрат ");
        for (row = 0; row < 4; row++) {
            for (col = 0; col < 4; col++) {
                System.out.print(probablyMagicNumber[row][col] + "  ");
            }
            System.out.println();
        }
        for (row = 0; row < 4; row++) {
            for (col = 0; col < 4; col++) {
                if (row == col) {
                    diagonal = diagonal + probablyMagicNumber[row][col];
                }
                if (row + col == 4 - 1) {
                    secondDiagonal = secondDiagonal + probablyMagicNumber[row][col];
                }
            }
            if (diagonal != secondDiagonal) {
                result = 1;
            } else {
                for (row = 0; row < 4; row++) {
                    thirdDiagonal = 0;
                    forthDiagonal = 0;
                    for (col = 0; col < 4; col++) {
                        thirdDiagonal = thirdDiagonal + probablyMagicNumber[row][col];
                        forthDiagonal = forthDiagonal + probablyMagicNumber[row][col];
                    }
                    if (thirdDiagonal != forthDiagonal) {
                        result = 1;
                    } else if (diagonal != thirdDiagonal) {
                        result = 1;
                    }
                }
                if (result == 1) {
                    System.out.println("Магически");
                } else {
                    System.out.println("Опитай пак");
                }

            }
        }
    }
}