package com.company;

import java.util.Scanner;

public class blackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Моля, запишете първо най-малкото число!");
        int digitA = scan.nextInt();
        int digitB = scan.nextInt();

        String isSmallerThanTwentyOne = (digitA < 21 && digitB < 21) ? "" + digitA : "0";
        System.out.println(isSmallerThanTwentyOne);
    }
}
