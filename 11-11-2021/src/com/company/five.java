package com.company;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int counter = 1; counter <= n; counter++) {
            if (counter % 5 == 0)
                System.out.println(counter);
        }
    }
}

