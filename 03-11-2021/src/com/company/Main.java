package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte n = scan.nextByte();
        int difference = n - 21;
        if (difference <= 21) {
            if (difference <= 21 && difference >= 0) {
                System.out.println(difference);
            } else {
                System.out.println(difference * -1);
            }
        } else {
            System.out.println(difference * 2);
        }
    }

}