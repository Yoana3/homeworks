package com.company;

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        int n = scan.nextInt();
        while (counter <= n) {
            if (counter%2==0) {
                System.out.println(counter);
            }
                counter++;

        }
    }
}
