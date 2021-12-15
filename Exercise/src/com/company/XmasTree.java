package com.company;

import java.util.Scanner;

public class XmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printChrismasTree(n);
    }

    public static void printChrismasTree(int n) {
        for (int segmentIndex = 1; segmentIndex <= n; segmentIndex++) {
            printSegment(segmentIndex, n);
        }
        printTreeTrunk(n);
    }

    public static void printTreeTrunk(int n) {
        printSpaces(n - 1);
        System.out.println("||");
    }

    public static void printSegment(int segmentIndex, int n) {
        for (int rowIndex = 0; rowIndex < segmentIndex; rowIndex++) {
            printRow(n, rowIndex);
            System.out.println();
        }

    }

    private static void printRow(int n, int rowIndex) {
        printSpaces(n-rowIndex-1);
        System.out.print("/");
        printSpaces(2 * rowIndex);
        System.out.print("\\");
    }

    public static void printSpaces(int numberOfSpaces) {
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.print(" ");
        }
    }
}
