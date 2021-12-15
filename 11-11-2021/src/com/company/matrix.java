package com.company;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputN=scan.nextInt();

        for (int rows = 1; rows <= inputN; rows++) {
            for (int counter = rows; counter <= inputN+rows-1; counter++) {

                System.out.print(counter + " ");

            }
            System.out.println();
        }

    }
}

