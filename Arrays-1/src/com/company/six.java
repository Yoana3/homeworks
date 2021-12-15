package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class six {
    public static void main(String[] args) {
        int[][] numbers = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66},
        };
        int colSum = 0;
        for (int rowIndex = 1; rowIndex < numbers.length; rowIndex++) {
            for (int colIndex = 0; colIndex < numbers[rowIndex].length; colIndex++) {
                if (rowIndex % 2 != 0) {
                    System.out.print(numbers[colIndex][rowIndex - 1] + " ");
                    colSum += numbers[colIndex][rowIndex - 1];
                }
            }
            if (rowIndex % 2 != 0) {
                System.out.println("Сумата е: " + colSum);
            }
            colSum = 0;
        }
    }
}