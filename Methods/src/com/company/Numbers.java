package com.company;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println(a / b);
        System.out.println(a / c);
        System.out.println(doMath(a, b, c));
    }

    public static boolean doMath(double firstNumber, double secondNumber, double thirdNumber) {
        double firstNumberDividedBySecond = firstNumber % secondNumber;
        double firstNumberDividedByThird = firstNumber % thirdNumber;
        if (firstNumberDividedBySecond == firstNumberDividedByThird) {
            boolean doesItHaveNoLeftover = firstNumberDividedBySecond == 0;
            return doesItHaveNoLeftover;
        }
        return false;
    }
}

