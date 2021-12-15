package com.company;

import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inputNumbersArray = new int[10];
        for (int counter = 0; counter < inputNumbersArray.length; counter++) {
            int numberFromConsole = scan.nextInt();
            inputNumbersArray[counter] = numberFromConsole;
        }
        checkingTheNumbers(inputNumbersArray);
    }

    public static void checkingTheNumbers(int[] array) {
        for (int numberPlace = 0; numberPlace < array.length; numberPlace++) {
            if (numberPlace + 1 <= array.length) {
                System.out.print(array[numberPlace]);
                if (array[numberPlace] > array[numberPlace + 1]) {
                    System.out.print(" > ");
                } else if (array[numberPlace] == array[numberPlace + 1]) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" < ");
                }
            }
        }
    }
}