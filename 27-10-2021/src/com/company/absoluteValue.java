package com.company;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit = scan.nextInt();

        String absoluteValue = digit > 0 ? "|" + digit + "|=" + digit : "|" + -digit + "|=" + digit;
        System.out.println(absoluteValue);

    }
}
