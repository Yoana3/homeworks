package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println(a / 3);
        System.out.println(b / 3);
        System.out.println(doMath(a, b));
    }

    public static boolean doMath(double firstNumber, double secondNumber) {
        double firstNumberDivided = firstNumber % 3;
        double secondNumberDivided = secondNumber % 3;
        boolean areTheySame = firstNumberDivided == secondNumberDivided;
        return areTheySame;
    }
}